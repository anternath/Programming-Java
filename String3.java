class String3{
    public static void main(String[] args){
        String[] names = {"Anter", "Ridoy","Robin","Saikat","Ram"};

        for( String x: names){
            System.out.println("Names: "+ x);
        }
        for(int i=0; i<names.length; i++){
            System.out.println("Names: " +names[i]);
        }
    }
}