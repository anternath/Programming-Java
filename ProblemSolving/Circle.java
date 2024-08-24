package ProblemSolving;

public class Circle extends Shape{
    double r;
    Circle(double r){
        super(r,r);
    }
    void area(){
        double result = Math.PI*dim1*dim1;
        System.out.println("Circle is :"+result);
    }
}
