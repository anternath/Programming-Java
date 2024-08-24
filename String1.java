import java.util.Collection;

class String1{
    public static void main(String[] args){
        String string1 = "Anter Nath";
        String string2 = new String("Anter Nath");
        String string3 = new String("anter nath");

        System.out.println(string1);
        System.out.println(string2);

        char[] string = {'A','n','t','e','r' }; //character type array is String.
        System.out.println(string); 

        int len = string1.length();
        System.out.print("len= "+len);

        //if(string1==string2){
        //    System.out.print("Equal");
        //}
        //else{
        //    System.out.print("Not Equal");
        //}
        // This method doesn't compare any value of String

        if(string1.equals(string2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }


        if(string1.equals(string3)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
        if(string1.equalsIgnoreCase(string3)){ // use ignoreCase method.
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }

        boolean b = string3.contains("nath");
        System.out.print("b= "+b);


    }
}