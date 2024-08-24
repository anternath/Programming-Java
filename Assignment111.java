import java.util.Scanner;
public class Assignment111 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int fact=1;
        int i=1;
        while(i<=num){
            if(num==0){
                fact = 1;
                System.out.println("Factorial is :"+fact);
                break;
            }
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial is :"+fact);
    }
    
}
