package File;
import java.io.File;
public class FileDemo {
    public static void main(String[] args){
        File dir = new File("E:/Person");
        dir.mkdir();
        String direction = dir.getAbsolutePath();
        System.out.println("File path is :"+direction);
        // if(dir.delete()){
        //      System.out.println(dir.getName()+"Folder has been deleted");if you delete any file you can use it.
        // }
        File File1 = new File(direction+"Students.java"); 
        File File2 = new File("E:/Person/Teacher.txt"); 
        File File3 = new File("E:/Person/Students.txt"); 
        try{
            File1.createNewFile();
            File2.createNewFile();
            System.out.println("There is no exception");
        }catch(Exception e){
            System.out.println("Exception is :"+e );
        }
        File3.delete();
        if(File3.exists()){
            System.out.println("File Exists :"+File3.getName());
        }
        else{
            System.out.println("There is no File "+File3.getName());
        }
    }
}
