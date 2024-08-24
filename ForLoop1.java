import java.util.Scanner;
public class ForLoop1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter final number :");
        int num = input.nextInt();
        for(int i=1; i<=num; i++){
            sum = sum + i*i;
            System.out.print(i+"x"+i+" ");
        }
        System.out.println();
        System.out.print(sum);
    }
}
