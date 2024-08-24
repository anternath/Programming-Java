public class DowhileLoop {
    public static void main(String[] args){
        int i=1;
        int sum =0;
        do{
            sum = sum + i;
            i++;
        }while(i<=10);
        System.out.println("The total number is :"+sum);
    }
}
