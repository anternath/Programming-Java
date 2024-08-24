package opp2.opp3;

import opp2.opp3.Products;
import java.util.Scanner;

public class List {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String na = input.nextLine();
        System.out.println("Enter Products Name: ");
        String pr = input.nextLine();
        System.out.println("Enter Price: ");
        int pri = input.nextInt();
        Products person = new Products();
        
        person.set(na , pr , pri);
        person.date();

        person.displayinformation();



    }
    
}
