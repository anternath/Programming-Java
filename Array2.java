import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array row number: ");
        int p = input.nextInt();
        System.out.print("Enter Array colunm number: ");
        int q = input.nextInt();
        int[][] numbers = new int[p][q];
        System.out.println("Enter the Array value: ");

        for(int i=0; i<p; i++){
            for(int j=0; j<q; j++){ 
                System.out.printf("A[%d][%d] = ",i,j);
                numbers[i][j]= input.nextInt();
            }
           
        }
        System.out.print("A=");
        for(int row=0; row<p; row++){
            for(int col=0; col<3; col++){
                System.out.print( " "+ numbers[row][col]);
            }
            System.out.println("");
        }
       
        
    }
}