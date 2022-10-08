/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 11212640
 */
public class Project3 {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        
        Produtor prod = new Produtor(buffer);
        Consumidor cons = new Consumidor(buffer);
        
        Thread t1 = new Thread(prod);
        Thread t2 = new Thread(cons);
        
        t1.start();
        t2.start();
        
        
    }
}
