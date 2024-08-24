package opp2.opp3.Opp12;

public class Overloading {
    
    void add(int a, int b, int c){
        int d = a+b+c;
        System.out.println("There are three numbers "+d);
    }
    void add(double x, double y){
        System.out.println(x*y);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("There is no eliments");
    }

}
