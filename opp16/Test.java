package opp16;

public class Test {
    public static void main(String[] args) {
        CallReference r1 = new CallReference();
        r1.name = "Anis";
        System.out.println("Name: "+r1.name);

        r1.change(r1);
        System.out.println("Name: "+r1.name);
    }
    
}
