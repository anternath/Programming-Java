import java.util.Scanner;
class ForEach{
    public static void main(String[] args){
        String[] names = {"Saikat","Nahid","Rimon","Rakib"};
        System.out.print("Array size: "+names.length);
        System.out.println("");
        for(String x : names){
            System.out.println(x);
        }
    }
    
}