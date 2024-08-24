class StirngBuffer{
    public static void main(String[] args){
        String s1 = "Anter";
       StringBuffer sb = new StringBuffer("Anter");
        System.out.println(sb);

        sb.append(" Nath");// add any item in StringBuffer
        System.out.println(sb);

        sb.append(05);
        System.out.println(sb);

        //sb.reverse();//Reverse any StringBuffer
        //System.out.print(sb);

        //sb.delete(6, 11);//Delete one or multiple character
        //System.out.println(sb);

        sb.setLength(10);//print selected character
        System.out.print(sb);

    }
}