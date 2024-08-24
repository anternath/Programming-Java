package TypeCasting;

public class Converting {
    public static void main(String[] args){
        int x = 26;//Byte > short > int > long > float > double.
        double y = x;
        double z = 16.3;
        int a = (int) z;
        System.out.println(y);
        System.out.println(a);
    }
}
