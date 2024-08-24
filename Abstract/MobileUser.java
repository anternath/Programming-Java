package Abstract;

abstract class MobileUser {
    void call(){//non abstract method
        System.out.println("I am call method");
    }
    abstract void massageSend();//abstract method
}
