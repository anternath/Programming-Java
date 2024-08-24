class StringBuffer3{
    public static void main(String[] args){
      StringBuilder str = new StringBuilder("Anter Nath");
      System.out.println(str);

      str.append(" (Anter)");
      System.out.println("FullName:" +str);

      str.reverse();
      System.out.println("After Reverse: " +str);

      str.delete(0,7 );
      System.out.println("After Reverse:"+str);

    }
}