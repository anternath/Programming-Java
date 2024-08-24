package objcasting;

public class Test {
    public static void main(String[] args){
        Person ob = new Person();
        ob.display();
        Person ob1 = new Teacher();
        ob1.display();
        Teacher ob2 =(Teacher) new Person();// Exception is thread error.
        ob2.display();
    }
}
