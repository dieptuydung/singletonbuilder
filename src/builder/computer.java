/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;





/**
 *
 * @author boss dung
 */public class computer {
    String CPU, RAM, SSD, HDD, screen;

    public computer(Builder builder) {
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.SSD=builder.SSD;
        this.HDD=builder.HDD;
        this.screen=builder.screen;
    }
    //public static 
    //thứ nhất khai báo public để thành phần bên ngoài nó truy cập đến lớp builder
    //thứ 2 khai báo statis để các lớp bên ngoài truy cập với lớp builder thông qua tên lớp computer

    @Override
    public String toString() {
        return "computer{" + "CPU=" + CPU + ", RAM=" + RAM + ", SSD=" + SSD + ", HDD=" + HDD + ", screen=" + screen + '}';
    }
    
    
    public static class Builder
     // nếu không có static thì các thành phần bên ngoài muốn truy cập đến lớp builder thông qua một  
     // đối  tượng computer,đối tượng là thể hiện của lớp
     //lớp builder có nhiệm vụ xây dựng đối tượng computer
    {
        
        String CPU, RAM, SSD, HDD, screen;

        private static Builder instance;
        
        protected static Builder CreateIntance()
        {
            if(instance == null)
                instance = new Builder();
            return
                instance;
        }
        
        public Builder() {
        }
        public Builder addCPU(String CPU)
        {
            this.CPU=CPU;
            return this;//this là đối tượng Builder
        }
        public Builder addRAM(String RAM)
        {
            this.RAM=RAM;
            return this;
            
        }
        public Builder addSSD(String SSD)
        {
            this.SSD=SSD;
            return this;
        }
        public Builder addHDD(String HDD)
        {
            this.HDD=HDD;
            return this;
        }
        public Builder addscreen(String screen)
        {
            this.screen=screen;
            return this;
        }
        
        public computer build()// phương thức trả về đối tượng của lớp mà ta cần xây dựng
        {
            return new computer(this);
            //this đại diện cho đối tượng của lớp mà ta đang viêt 
        }
    }
         

 
    
}
