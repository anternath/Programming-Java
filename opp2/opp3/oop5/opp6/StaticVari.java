package oop5.opp6;

public class StaticVari {

    String name;
    int Id;
    static String institute = "Chittagong Polytechnic Institute";//Static Variable

    StaticVari(String n, int i){
        name = n;
        Id = i;
        // not use mamory space Static variable
    }

    void displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("id: "+Id);
        System.out.println("Institute: "+institute);
    }
    
}
