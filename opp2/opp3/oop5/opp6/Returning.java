package oop5.opp6;

public class Returning {
    public static void main(String[] args){
        ReturingMethod obj1 =  new ReturingMethod();
        int result= obj1.square(5);

        System.out.println("Square of number of 5: "+result);
        System.out.println("Square of number of 5: "+obj1.square(3));

        int CuResult = obj1.cube(5);
        System.out.println("Square of number of 5: "+CuResult);
    }
    
}
