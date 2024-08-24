package ToString;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Name :"+name+"\nAge :"+age;
    }
}
