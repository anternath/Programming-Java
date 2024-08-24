package PracticesLinked;
import java.util.LinkedList;
public class StudentsList {
    public static void main(String[] args){
        LinkedList<Students> obj = new LinkedList<Students>();

        Students s1 = new Students("Anter Nath", 639192, 101);
        Students s2 = new Students("Akash Nath", 639193, 102);
        Students s3 = new Students("Jibon Nath", 639194, 103);
        Students s4 = new Students("Ripon Nath", 639195, 104);
        obj.add(s1);
        obj.add(s2);
        obj.add(s3);
        obj.add(s4);
        for( Students s : obj){
            System.out.println("Name :"+s.name+"  Roll :"+s.roll+"  ID :"+s.id);
        }
    }
}
