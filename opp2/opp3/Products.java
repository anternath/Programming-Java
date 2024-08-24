dpackage opp2.opp3;

import java.util.Date;

public class Products {
     
   void date(){
    Date d = new Date();
    System.out.println("Date: "+d);
   }
    String products , name;
    int price;

    void set(String n, String p, int pr){
        name = n;
        products = p;
        price = pr;
    }
        
    
    void displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("Products: "+products);
        System.out.println("Price: BDT "+price);
    }
    
    
}
