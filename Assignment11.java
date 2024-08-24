import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int sum = 1;
        for (int j=1; j<=i; j++){
            sum = sum*j;
        }
        System.out.println("The Factorial of "+i+"is "+sum);
    }
}
