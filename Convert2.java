class Convert2{
    public static void main(String[] args){
        int dicimal = 12;

        String binary = Integer.toBinaryString(dicimal);
        System.out.println("12 Of binary: "+binary);

        String octal = Integer.toOctalString(dicimal);
        System.out.println("12 of Octal "+octal);

        String hexaD = Integer.toHexString(dicimal);
        System.out.print("12 of hexadecimal :"+hexaD);



    }
}