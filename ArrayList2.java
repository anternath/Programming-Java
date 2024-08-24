import java.util.ArrayList;
import java.util.Collections;
class ArrayList2{
    public static void main(String[] args){
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
        System.out.println("number1 = "+number1);
        
        number2.add(60);
        number2.add(70);
        number2.add(80);
        number2.add(90);
        number2.add(50);
        System.out.println("number2 = "+number2);

        number3.addAll(number1);
        System.out.println("number3 = "+number3);

        boolean check = number1.equals(number3);
        System.out.println("check =" +check);

        check = number1.equals(number2);
        System.out.println("check= "+check);

        Collections.sort(number2);
        System.out.println("Sorting number: "+number2);

        Collections.sort(number2,Collections.reverseOrder());
        System.out.println("Sorting number descending Order: "+number2);



    }
}