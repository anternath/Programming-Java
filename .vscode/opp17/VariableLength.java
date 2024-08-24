package.opp17;

public class VariableLength {
    void change(int ... num){
        int sum = 0;
        for(int x: num){
              sum = x+sum;
        }
        System.out.println("Total number: "+sum);
    }
    
}
