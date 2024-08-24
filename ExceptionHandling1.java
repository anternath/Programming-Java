import java.util.Scanner;
public class ExceptionHandling1 {
    public static void main(String[] args){
        int count =0;
       do{
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number1 :");
            int num1 = input.nextInt();
            System.out.print("Enter number2 :");
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println(num1+"/"+num2+"="+result);
            count++;
           }
           catch(Exception e){
            System.out.println("Exception :"+e);
            System.out.println("You must Enter integer: ");
           }
       }while(count==0);
    }
}
