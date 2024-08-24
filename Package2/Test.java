package Package2;
import Package1.Dog1;
import AccessModifier.A;
public class Test extends A {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.protect();
        Dog1 obj1 = new Dog1();
        obj1.help();
        Test o = new Test();
        o.B();

    }
}
