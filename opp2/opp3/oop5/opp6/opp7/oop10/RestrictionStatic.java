package oop10;

public class RestrictionStatic {
    String name = "Anter Nath";

    static String name2 = "Ridoy Nath";

    void Nonstatic(){
        System.out.println("Name: "+name);
        System.out.println("Name: "+name2);//you can easily use static method in a nonstaic methdod;
    }
    static void Static(){
        System.out.println("Name:"+name2);
        //System.out.println("Name:"+name); (A nonstatic method restricted by static method)

    }
}
