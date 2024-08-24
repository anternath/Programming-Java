package LinkedList;
import java.util.LinkedList;
public class Test {
    public static void main(String[] args){
        LinkedList<Person> object = new LinkedList<Person>();
        Person s1 = new Person("Anter",639192, 20);
        Person s2 = new Person("Robin",639193, 20);
        Person s3 = new Person("Sabuj",639194, 20);
        Person s4 = new Person("Abrar",639195, 20);

        object.add(s1);
        object.add(s2);
        object.add(s3);
        object.add(s4);

        for(Person s: object ){
            System.out.println("Name :"+s.name+"  ID :"+s.id+"  Age :"+s.age);
        }
    }
}
