/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project3;

import java.util.Random;
import static java.lang.Thread.currentThread;

/**
 *
 * @author 11212640
 */
public class Produtor implements Runnable {
    private Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;   
    }
    
     public float rand(){
        return new Random().nextFloat();
     }
     
    @Override
    public void run() {
        try {
            for (int i = 0; i < 101; i++) {
                buffer.armazena(i);
                Thread.sleep((long) rand());
            }
        } catch (InterruptedException ex) {
            
        } finally {
            currentThread().interrupt();
        }
            
    }
}
