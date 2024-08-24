package oop10.oop11;

public class StaticBlock {
    static int roll;
    static String name;
    static{
        System.out.println("Static block");
         name = "Anter";
         roll = 101;
    }
    static void DisplayBlock(){
       System.out.println("Name:" +name);
       System.out.println("Roll:" +roll);
    }
    static{
        System.out.println("Static block 2");// compilar execute started first at class so Static block2 printed before static method; 
    }
}
