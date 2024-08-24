package opp20;

public class Teacher extends Person {
   
  private String qualification;
  public void setQualification(String qualification){
    this.qualification= qualification;
  }
  public String getQualification(){
    return qualification;
  }
   void displayinfo(){
    System.out.println("Name: "+ getName());
    System.out.println("Age: "+ getAge());
   }
}
