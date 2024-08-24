class Wrapper{
    public static void main(String[] args){
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);
        Integer z = x;//Automatic call Integer.valueOf(x) unboxing
        System.out.println(z);
        double a = 10.20;
        Double p = new Double.valueOf(10.20);
        System.out.println("p="+p);

        double e = p;//Automatic write p.doubleValue() unboxing
        System.out.println("e="+e);

        
    }
}