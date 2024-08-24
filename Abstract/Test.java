package Abstract;

public class Test {
    public static void main(String[] args){
        MobileUser ms;//Refarence variable
        ms = new Korim();
        ms.call();
        ms.massageSend();
        ms = new Rohim();
        ms.massageSend();
    }
}
