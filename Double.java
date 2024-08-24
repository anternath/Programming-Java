import java.text.DecimalFormat;

public class Double {
    public static void main(String[] args){
        DecimalFormat obj = new DecimalFormat("0.000");
        double x = 2.234545;
        System.out.println("x ="+obj.format(x));
    }
}
