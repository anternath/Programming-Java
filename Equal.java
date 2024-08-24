public class Equal {
    public static void main(String[] args){
        String password1 = "Anter 123";
        String password2 = "Anter 123";
        String password5 = "anter 123";
        String password3 = new String("Anter 123"); 
        String password4 = new String("Anter 123"); 
        System.out.println(password1.equals(password2));
        System.out.println(password3.equals(password4));
        System.out.println(password1.equals(password4));
        System.out.println(password1==password2);// compares the referances of the objects not the value.
        System.out.println(password3==password4);
        System.out.println(password3==password1);
        System.out.println(password1.equalsIgnoreCase(password5));// this method is not case sensetive.
    }
}
