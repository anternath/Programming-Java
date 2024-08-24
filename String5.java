class String5{
    public static void main(String[] args){
        String a1 = "I Love My country(bangladesh)";
        System.out.println(a1);

        String a2 = a1.replace('b', 'B');// use method replace any char
        System.out.println(a2);

        String[] a3 = a1.split(" ");// Spilt any String
        for( String x : a3){
            System.out.println(x);
        }
    }
}