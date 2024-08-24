import java.util.LinkedList;

public class List {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        System.out.println("Your choose country list :");
        obj.add("Bangladesh");
        obj.add("India");
        obj.add("China");
        obj.add("Nepal");
        obj.add(4,"Japan");
        obj.addFirst("Dubai");
        obj.addLast("Russia");
        obj.remove("India");
        obj.remove(4);

        for(String country: obj){
            System.out.println(country);
        }
        System.out.println("You first choose is:"+obj.getFirst());
        System.out.println("You last choose is "+obj.getLast());
        obj.clear();
        System.out.println(obj);
    }
}
