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
public class Singleton {
    private static Singleton instance;
    int count =0;
    protected  Singleton()
    {
        
    
    
    
}
    public  static Singleton createInstance()
    {
        if(instance==null)
            instance =new Singleton();
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
