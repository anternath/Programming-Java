import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        int i, t,n;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        for(i=1; i<=t; i++){
           
            n = input.nextInt();
            if(n%2==0){
                System.out.println( "even");
               }
               else{
                System.out.println("odd");
            }
        }

    }
}