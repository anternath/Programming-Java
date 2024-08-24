import java.util.Scanner;
public class Condition {
    public static void main(String[] args){
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Two numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int large = (num1>num2)? num1:num2;//Condition : Condition?Expression1:Expression2;
        System.out.println("The large number is :"+large);
    }
}
