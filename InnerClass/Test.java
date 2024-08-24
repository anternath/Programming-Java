package InnerClass;

public class Test {
    public static void main(String[] args){
        OuterClass obj = new OuterClass();
        OuterClass.InneClass obj1 = obj.new InneClass();
        System.out.println(obj.x + obj1.y);
    }
}
