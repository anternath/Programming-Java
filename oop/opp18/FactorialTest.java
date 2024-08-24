package oop.opp18;

public class FactorialTest {
    int Fact(int n){
        if(n==1)
        return 1;// base case

        else
        return n*Fact(n-1); //recursive call
    }

    
}
