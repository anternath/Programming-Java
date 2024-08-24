import java.util.Random;
class Random1{
  public static void main(String[] args){
    Random rand = new Random();

    int randnumber = rand.nextInt(6)+5;
    System.out.println(randnumber);
  }
}