import java.io.File;
import java.util.Scanner;
public class FileRead1 {
    public static void main(String[] args){
        try{
            File file = new File("D:/begginerjava/Hashmap.java");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String code = scanner.nextLine();
                String code1 = scanner.nextLine();
                String code2 = scanner.nextLine();
                String code3 = scanner.nextLine();
                String code4 = scanner.nextLine();
                System.out.println("Code :"+code);
                System.out.println("Code :"+code1);
                System.out.println("Code :"+code2);
                System.out.println("Code :"+code3);
                System.out.println("Code :"+code4);
                scanner.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
