package Polymorphism1;

public class Triangle extends Shape{
    double base,height;
    Triangle(double b, double h){
        base = b;
        height = h;
    }
    double area(){
        System.out.print("The Triangle Area is :");
        return 0.5*base*height;
    }
}
