import java.util.Scanner;
class Array{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int sum= 0;
        System.out.print("Enter Array size: " );
        n = input.nextInt();
        int[] number = new int[n];
        System.out.print("Enter "+n+"number: ");
        for(int i=0; i<n; i++){
            number[i]= input.nextInt();
        }
        for(int x: number){//For Each Loop
           sum = sum + x;
        }
        System.out.print("The total number is: "+sum );
    }
}