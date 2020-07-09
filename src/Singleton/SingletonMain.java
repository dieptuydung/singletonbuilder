/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author boss dung
 */
public class SingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.createInstance();
        Singleton s2 =Singleton.createInstance();
        s1.setCount(5);
        System.out.println("Count S1"+s1.getCount());
        s2.setCount(10);
        System.out.println("Count S2"+s1.getCount());
        System.out.println("Count S1"+s1.getCount());
        
        
        // TODO code application logic here
    }
    
}
