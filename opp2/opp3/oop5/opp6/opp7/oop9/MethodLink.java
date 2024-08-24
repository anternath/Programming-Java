package oop9;

public class MethodLink {
    public static void main(String[] args) {
        StaticMethod obj1 = new StaticMethod();
        obj1.display1();//Non static method called by object.
        
        StaticMethod.display2();//Static method called by Class name.
    }
    
}
