package opp16;

public class VariableLength {
    void length(int ... num){
        int sum= 0;
        for(int x:num){
            
            sum = x + sum;
            
        }
        System.out.println("Total number: "+sum);
    }
    
}
