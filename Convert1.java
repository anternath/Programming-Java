class Convert1{
    public static void main(String[] args){
        String bin = "0111";

        Integer a = Integer.parseInt(bin,2);
        System.out.println(a);

        String octal = "346";
        Integer b = Integer.parseInt(octal,8);
        System.out.println(b);

        String hexaD = "3F5";
        Integer c = Integer.parseInt(hexaD,16);
        System.out.println(c);


    }
}