public class WhileLooop {
    public static void main(String[] args){
        int i=2;
        int sum = 0;
        while (i<=10) {
            sum = sum+i;
            i=i+2;
        }
        System.out.println("The total number is : "+sum);
    }
}
