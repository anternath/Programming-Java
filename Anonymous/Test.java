package Anonymous;

public class Test {
    public static void main(String[] args){
        Prerson n = new Prerson(){
            void display(){
                System.out.println("Anonymous class");
            }
        };
        n.display();
    }
}
