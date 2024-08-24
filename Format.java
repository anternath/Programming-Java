public class Format{
public static void main(String[] args){
    boolean b = true;//dynamic initialization
    double a = 5.55115;
    float f = 4.3893f;
    String x = "anter nath";
    char c = 'a';

    System.out.printf("boolean b= %b\n",b);//format specifiers
    System.out.printf("double d= %.4f\n",a);
    System.out.printf("String s= %s \n ",x);
    System.out.printf("char c =%c \n",c);
    System.out.printf("float f= %f",f);
}
}