import java.util.Scanner;

public class Watermelon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int weigth = input.nextInt();
        System.out.println("Enter the weight :");

        if(weigth%2==1){
            System.out.println("NO");
        }
        else{
            if(weigth == 2){
                System.out.println("NO");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}