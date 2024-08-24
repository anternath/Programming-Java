package oop26;

public class Car extends Vehicles{
    int gear;
    Car(String c, double w, int g){
        super(c,w);
        gear = g;
    }
    void attributes(){
        super.attributes();
        System.out.println("Gear :"+gear);
    }
    
}
