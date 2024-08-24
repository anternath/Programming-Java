import java.util.Scanner;
class Matrix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Diagonal = 0 ;
        int sumOfupperElements = 0;
        int sumOfLowerElements = 0;
        int[][] A = new int[3][3];
        System.out.print("Enter The Value of A: ");
        for(int row= 0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col] = input.nextInt();
            }
        }
        System.out.println("\n\n");
        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                System.out.print("\t "+A[row][col]);
            }
            System.out.println("\n\n");
        }
        System.out.print("Diagonal number is: ");
        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                if(row==col){
                Diagonal = Diagonal + A[row][col];
                System.out.println("\t"+A[row][col]);
            }
            if(row<col){
                sumOfupperElements = sumOfupperElements + A[row][col];
                System.out.println(A[row][col]);
            }
            if(row>col){
                sumOfLowerElements = sumOfLowerElements + A[row][col];
                System.out.println(A[row][col]);
            }
            }

        
        }
        System.out.println("Diagonal Addition: " +Diagonal);
        System.out.println("sumOfupperElements: " +sumOfupperElements);
        System.out.println("sumOfLowerElements: " +sumOfLowerElements);

    }
}