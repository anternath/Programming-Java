package problem;

public class Box {
    double height;
    double width;
    double depth;

    Box(double h, double w, double d){
        height= h;
        width = w;
        depth = d;
    }
    void displayvolume(){
        double Volume = height*width*depth;
        System.out.println("Box Volume:"+Volume);
    }
}
