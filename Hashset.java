import java.util.HashSet;
public class Hashset {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Watermelon");

        System.out.println(fruits);
        System.out.println("Size :"+fruits.size());
        fruits.remove("Orange");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        boolean value = fruits.isEmpty();
        System.out.println(value);
    }
}
