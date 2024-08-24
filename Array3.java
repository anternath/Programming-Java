import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array row number: ");
        int p = input.nextInt();
        System.out.print("Enter Array colunm number: ");
        int q = input.nextInt();
        int[][] numbers = new int[p][q];
        int[][] numbers2 = new int[p][q];
        int[][] total = new int[p][q];
        System.out.println("Enter the value of number: ");

        for(int i=0; i<p; i++){
            for(int j=0; j<q; j++){ 
                System.out.printf("A[%d][%d] = ",i,j);
                numbers[i][j]= input.nextInt();
            }
           
        }
        System.out.println("Enter the value of numbers2: ");
        for(int i=0; i<p; i++){
            for(int j=0; j<q; j++){ 
                System.out.printf("A[%d][%d] = ",i,j);
                numbers2[i][j]= input.nextInt();
            }
           
        }
        System.out.println("number=");
        for(int row=0; row<p; row++){
            for(int col=0; col<q; col++){
                System.out.print( "\t "+ numbers[row][col]);
            }
            System.out.println("\n\n");
        }
        System.out.println("numbers2=");
        for(int row=0; row<p; row++){
            for(int col=0; col<q; col++){
                System.out.print( "\t "+ numbers2[row][col]);
            }
            System.out.println("\n\n");
        }
        System.out.println("numbers + numbers2=");
        for(int row=0; row<p; row++){
            for(int col=0; col<q; col++){
                total[row][col] = numbers[row][col]+numbers2[row][col];
                System.out.print( "\t "+ total[row][col]);
            }
            System.out.println("\n\n");
        }
    }
}