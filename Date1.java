import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
class Date1{
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);
        DateFormat datenow = new SimpleDateFormat("dd/MM/YYYY");
        String current = datenow.format(now);
        System.out.println("Current date : "+current);
    }
}