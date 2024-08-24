package Final_keyword;

public class University {
    final String UNIVERSITY_NAME = "NORTHWESTERN POLYTECHNICAL UNIVERSITY";
    final int FEES;
    static final String Student_Name;
    static{
        Student_Name = "Anter Nath";
    }
     University(){
        FEES = 150000;
     }
     void display(){
        System.out.println("University Name :"+UNIVERSITY_NAME);
        System.out.println("Student Name :"+Student_Name);
        System.out.println("Amount of Fees :"+FEES);
     }
}
