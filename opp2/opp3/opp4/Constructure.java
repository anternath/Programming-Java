package opp4;

public class Constructure {
    Constructure(){
        System.out.println("No Value");
    }

    String name, gender;
    int age;
    Constructure(String n, String g, int a){
       name = n;
       gender = g;
       age = a;
    }
    void displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("Gerner: "+gender);
        System.out.println("Age: "+age);
    }
    
}
