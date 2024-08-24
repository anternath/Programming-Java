import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args){
        char ch1;
        char ch2;
        Scanner input = new Scanner(System.in);
        System.out.println("Have you complete Masters? ");
        ch1 = input.next().charAt(0);
        System.out.println("Have you fluent in English?");
        ch2 = input.next().charAt(0);
        if((ch1=='y'|| ch1=='Y')&&(ch2=='y'|| ch2=='Y')){
            System.out.println("You are aligible for this Interview");
        }
        else if((ch1=='n'||ch1== 'N')&&(ch2=='n'||ch2== 'N')){
            System.out.println("Sorry! You are not aligible to for the job interview");
        }
        else if((ch1=='n'||ch1== 'N')&&(ch2=='y'||ch2== 'Y')){
            System.out.println("Sorry! You are not aligible to for the job interview");
        }
        else if((ch1=='y'||ch1== 'Y')&&(ch2=='n'||ch2== 'N')){
            System.out.println("Sorry! You are not aligible to for the job interview");
        }
        else{
            System.out.println("Invalid character!!");
        }
    }
}
