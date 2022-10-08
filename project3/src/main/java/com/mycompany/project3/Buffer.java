/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 11212640
 */
public class Buffer {
    int archives;
    int[] backup;
    private Lock arqLock;
    private Condition cond;
    
    public Buffer(){
        
        backup = new int[5];
        arqLock = new ReentrantLock();
        cond = arqLock.newCondition();
    }
    
    public void armazena(int arq) {
        System.out.println("Armazenando");
        arqLock.lock();
        try {
            while(archives != 0){
                System.out.println(arq);
                cond.signalAll();
                cond.await();
                
            }
            archives = arq;
            //System.out.print(", arquivo " + archives);
            
        } catch (InterruptedException ex) {
            
        } finally {
            
            arqLock.unlock();
        }
    }
    
    public void consome(){
        arqLock.lock();
        try {
            if (archives != 0) {
                System.out.println("Gravando = " + archives);
                archives = 0;
            } else {
                cond.signalAll();
                Thread.sleep(100);
                cond.await();
            }
            
        } catch (InterruptedException ex) {
                
        } finally {
            arqLock.unlock();
        }
    }
    
    public void printar(){
        System.out.print("Gravados = ");
        for (int i = 0; i < 5; i++){
            if(backup[i] != 0){
                System.out.print(backup[i] + " ");
            }
        }
    }
}
