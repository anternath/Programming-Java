import java.util.Scanner;
public class Assignment12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter Starting number :");
        num1 = input.nextInt();
        System.out.println("Enter Ending number :");
        num2 = input.nextInt();
        for(int i= num1; i<=num2; i++ ){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
