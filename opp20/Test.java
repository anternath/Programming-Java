package opp20;

public class Test{
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.setName("Anter Nath");
        obj.setAge(20);
        obj.setQualification("Diploma in Engineer");
        obj.displayinfo();
        System.out.print("Qualification: "+ obj.getQualification());
        System.out.print("\n \n");

        Teacher obj2 = new Teacher();
        obj2.setAge(33);
        obj2.setName("Anisul Islam");
        obj2.setQualification("MSc in CSE");
        obj2.displayinfo();
        System.out.println("Qualification: "+obj.getQualification());
    }
   
    
}
