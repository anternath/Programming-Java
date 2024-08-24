import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args){
        String id, name;
        try{
            Formatter formatter = new Formatter("E:\\Person\\Teacher.txt");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter list number:");
            int num = input.nextInt();
            for(int i=1; i<=num; i++){
                System.out.print("Enter id & name :");
                id = input.next();
                name= input.next();
                formatter.format("%s %s \r \n", id, name);
            }
            formatter.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
