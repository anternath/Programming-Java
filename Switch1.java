import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = input.nextInt();
        switch(num){
            case 1:
            System.out.print("One");
            break;
            case 2:
            System.out.println("Two");
            break;
            case 3:
            System.out.println("Three");
            break;
            case 4:
            System.out.println("Four");
            break;
            case 5:
            System.out.println("Five");
            break;
            default:
            System.out.println("Invalid Value");
        }
    }
}
