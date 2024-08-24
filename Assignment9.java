import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Select Bangali. Please press 1 :");
        System.out.println("Select English. Please press 2 :");
        System.out.println("Select Urdu. Please press 3 :");
        System.out.println("Select Hindi. Please press 4 :");
        num = input.nextInt();
        switch(num){
            case 1:
            System.out.println("Bangali Selected!");
            break;
            case 2:
            System.out.println("English Selected!");
            break;
            case 3:
            System.out.println("urdu Selected!");
            break;
            case 4:
            System.out.println("Hindi Selected!");
            break;
            default:
            System.out.println("Invalid Number");
        }
    }
}
