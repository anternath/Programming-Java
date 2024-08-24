package opp18.opp19;

public class Teacher extends Person {// sub class, child class

    String qualification;
    void displayinfo2(){
        displayinfo1();
        System.out.println("Qualification : "+qualification);
    }

}
