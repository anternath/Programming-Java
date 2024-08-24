import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Date2{
    public static void main(String[] args){
        LocalTime time = LocalTime.now();

        System.out.println(time);
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("hh:mm:ss");
        String Formattedtime = time.format(timeformat);

        System.out.println(Formattedtime);


    }
}