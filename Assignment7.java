import java.util.Scanner;
public class Assignment7{
    public static void main(String[] args){
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Do you love Java? Please press y/n : ");
        ch = input.next().charAt(0);
        if(ch== 'y'||ch=='Y'){
            System.out.println("You are a Java Lover!");
        }
        else if(ch=='n'|| ch=='N' ){
            System.out.println ("You are not a java lover!");
        }
        else{
            System.out.println("Invalid character!!");
        }
    }
}