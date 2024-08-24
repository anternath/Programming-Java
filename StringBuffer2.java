class StringBuffer2{
    public static void main(String[] args){
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);
        
        String sb1 = sb.reverse().toString();

        if(s1.equals(sb1)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }

    }
}