package AccessModifier;

public class A {
    public void dog(){
        System.out.println("Dog is a domenestic animal");
    }
    protected void B(){
        System.out.println("It can be access own package and another pacakage");
        System.out.println("but if you use it antother package you must extends this class which had protected modifier");
         
    }
    private void sequrity(){
        System.out.println("It is access only own package!");
    }
    void default_1(){
        System.out.println("It is not accessable at another pacakage!");
    }
    
}
