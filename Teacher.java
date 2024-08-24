import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Teacher{
    public static void main(String[] args){
        LocalTime time = LocalTime.now();

        DateTimeFormatter timeformat =  DateTimeFormatter.ofPattern("hh:mm:ss");

       String datetime = time.format(timeformat);

       System.out.println(datetime);

        


    }
}