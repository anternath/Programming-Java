import java.util.Scanner;
public class E_Area_of_a_Circle{
    public static void main(String[] args){
        int r;
        Scanner input = new Scanner(System.in); 
        r = input.nextInt();
        double area = Math.PI*r*r;
        System.out.print(area);
    }
}