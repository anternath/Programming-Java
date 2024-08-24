package Polymorphism1;

public class Rectangle extends Shape {
    double height, weight;

    Rectangle(double h, double w){
        height = h;
        weight = w;
    }
    double area(){
        System.out.print("The Rectangle Area is :");
        return height*weight;
    }
}
