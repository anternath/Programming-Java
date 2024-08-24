public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int x = 10;
        int y = 0;
        int result = x/y;
        System.out.println("Result :"+result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception object:"+e);
        }
        // catch(Exception Object_name){
        //     System.out.println("Multiple Catch!");
        // }
       finally{
        try{
            int[] ary = new int[3];
            ary[3] = 20;
            System.out.println("3 of index :"+ary);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception object :"+e2);
        }
       }
    }
}
