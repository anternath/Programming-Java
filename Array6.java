import java.util.Arrays;

class Array6{
    public static void main(String[] args){
       int[] number ={10,12,15,13,18};
       String[] names = {"Anter","Ridoy","Sajib","Delip","Prodip","puson"};
       Arrays.sort(number);
       Arrays.sort(names);
       System.out.print("Ascending Number: ");
       for(int i=0; i<5; i++){
        System.out.print(" "+number[i]);
       }
       System.out.println();
       System.out.print("Descending number: ");
       
       for(int i=4; i>=0; i--){
        System.out.print(" "+number[i]);
       }
       System.out.println("");
       System.out.println("Names: ");
       for(int i=1; i<6; i++){
        System.out.println(" "+names[i]);
       }
      
        
    }
}