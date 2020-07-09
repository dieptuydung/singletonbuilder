

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author boss dung
 */
public class BuilderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        computer Computer = computer.Builder.CreateIntance()
                .addCPU("CPU core i9 9900")
                .addRAM("32GB Ram KingMax")
                .addSSD("512GB Samsum Pro 860 Evo")
                .addHDD("1TB WD Black")
                .addscreen("LG 24inches")
                .build();
        System.out.println(Computer.toString());
        
    }
    
}

