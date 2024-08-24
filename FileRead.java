import java.io.File;
import java.util.Scanner;
public class FileRead{
    public static void main(String[] args){
        try{
            File file = new File("E:/Person/Teacher.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID :"+id+"  Name :"+name);
                scanner.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}