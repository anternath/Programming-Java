import javax.sound.midi.Soundbank;

class String2{
    public static void main(String[] args){
        String name = new String("Anter");
        String lastName = new String(" Nath");

        String fullname = name + lastName;
        System.out.println("Full name use with operator: "+fullname);

        String Surename = name.concat(lastName);
        System.out.println("Fullname use with concat method: "+Surename);

        String upper = fullname.toUpperCase();
        System.out.println("Upper: " +upper);
        
        String Lower = fullname.toLowerCase();
        System.out.println("Lower: " +Lower);

        boolean Start = fullname.startsWith("A");
        System.out.println("Start With  A: "+ Start);

        boolean End = fullname.endsWith("h");
        System.out.println("Ends With H: "+ End);

        String[] names = {"Anter","Ridoy","Rakib"};
        for(String x : names){
            System.out.println(x);
        }

        
    }
}