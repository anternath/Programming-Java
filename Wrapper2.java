class Wrapper2{
    public static void main(String[] args){
        int x =100;
        String s = Integer.toString(x);//Integer to string for toString();
        System.out.println(s);

        double a = 50.30;//Double to string for toString();
        String b = Double.toString(a);
        System.out.println("b=" +b );

        String p = "50";//Sting to Integer for parseInt()
        int q = Integer.parseInt(p);
        System.out.println(q);

        String r = "11";//Sting to Double for parseDouble();
        double y = Double.parseDouble(r);
        System.out.println("y="+y);

        String w = "32";
        int t = Integer.valueOf(w);
        System.out.print(w);
    }
}