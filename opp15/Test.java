package opp15;

public class Test {
    public static void main(String[] args) {
        CallValue ob1 = new CallValue();
        
        int x= 10;//Actual value
        System.out.println(x);

        ob1.change(x);
        System.out.println("After call x"+x);
    }
    
}
