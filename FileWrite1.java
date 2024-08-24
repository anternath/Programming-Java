import java.util.Formatter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWrite1 {
    public static void main(String[] args){
        String programm = "public class Students{\n public static void main(String[] args){\n int roll = 639192; \n System.out.println(roll);\n}\n}";
        try{
            Formatter formatter = new Formatter("E:\\Person\\Students.java");
            
            formatter.format("%s",programm);
            formatter.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
