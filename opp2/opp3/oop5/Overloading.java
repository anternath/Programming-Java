package oop5;

public class Overloading {
    String Products;
    int price, weight;

    Overloading(){
        System.out.println("Bill");
    }
    Overloading(String p, int pr){
        Products =p;
        price = pr;

    }
    Overloading(String p, int pr, int w){
        Products = p;
        price = pr;
        weight = w;
    }
    void displayinformation(){
        System.out.println("Products: "+ Products);
        System.out.println("Price: "+price);
        System.out.println("Weight: "+ weight);
    }
}
