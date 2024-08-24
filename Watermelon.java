import java.util.Scanner;
class Watermelon{
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("Enter the value of weigth :");
         int weigth=input.nextInt();
         if (weigth%2==1){
            System.out.println("NO");
         }
         else{
            if( weigth==2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
         }
    }
}