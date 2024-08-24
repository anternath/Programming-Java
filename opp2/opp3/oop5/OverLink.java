package oop5;

public class OverLink {
    public static void main(String[] args){
        Overloading bill = new Overloading();
        Overloading person1 = new Overloading("Sugar",220);
        person1.displayinformation();

        Overloading person2 = new Overloading("Noodles", 65, 500);
        person2.displayinformation();
    }

    
}
