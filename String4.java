class String4{
    public static void main(String[] args){
        String edu = "   I am a Software Engineer  ";
        System.out.println(edu);

        String education = edu.trim();//remove space of head and tail
        System.out.println(education);

        char ch = education.charAt(7);//character index
        System.out.println(ch);

        int value = education.codePointAt(6);//character ASCII code 
        System.out.println(value);

        int pos = education.indexOf('e');// index of any first character in String
        System.out.println("Index of first e: " +pos);

        int lastpos = education.lastIndexOf('e');// index of any last character in a string
        System.out.println("Index of last e: " +lastpos);
    }
}