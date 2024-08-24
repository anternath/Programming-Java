package Polymorphism1;

public class Test {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0]=new Shape();
        s[1]=new Rectangle(20,40);
        s[2]=new Triangle(20,40);

        for(int i=0; i<=2; i++){
            System.out.println(s[i].area());
        }
        }
}
