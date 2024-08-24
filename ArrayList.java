import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class ArrayList1{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(7);

        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);

        list.add(3,6);
        System.out.println(list);

        list.set(0,0); //replace a value
        System.out.println(list);
        
        list.remove(2);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        boolean absence = list.contains(5);
        System.out.println("5  absence: " +absence);

        int pos = list.indexOf(6);
        System.out.print("The position of 6: "+pos);

       
        System.out.println("");
        list.add(0);

        Collections.sort(list); // use sorting mathod
        System.out.println(list);

        for( int x : list){ //use for each loop
            System.out.print(" "+x);
        }
        System.out.println("");
        for(int i=0; i<list.size(); i++){//use for loop
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println("");
        list.removeAll(list);
        System.out.print("After removing all elements: "+ list);
        
        System.out.println("");
        boolean check = list.isEmpty();
        System.out.print("ArrayList Empty: " +check);
    }
}