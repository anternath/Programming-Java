import java.util.Scanner;

class Circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Redius: ");
        double r = input.nextDouble();

        double area = Math.PI*r*r;
        System.out.println("The circle area is :"+area);

    }
}