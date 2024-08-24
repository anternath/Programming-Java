package oop23;

public class Super2 extends Super {
    String name = "Anter Nath";
     void display(){
        System.out.println("Name: "+super.name);//called super class variable
        System.out.println("Full Name: "+name);
    }
}
