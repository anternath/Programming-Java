package oop21;

public class Test {
    public static void main(String[] args){
        Animal a = new Animal();
        Person b = new Person();
        Teacher t = new Teacher();

        System.out.println(a instanceof Animal);
        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Person);
        System.out.println(t instanceof Animal);
        System.out.println(t instanceof Person);
        System.out.println(b instanceof Teacher);
        System.out.println(a instanceof Person);
    }
    
}
