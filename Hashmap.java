import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap <String, String> mobile = new HashMap <String, String>();

        mobile.put("Mother", "01888307573");
        mobile.put("Father", "01845257844");
        mobile.put("Ridoy", "01814078541");
        mobile.put("Anter", "01612141904");

        System.out.println(mobile.get("Anter"));
        System.out.println(mobile.get("Ridoy"));
        System.out.println(mobile.get("Mother"));
        System.out.println(mobile.get("Father"));
    }
}
