class HiddingVar{
    double height;
    double width;
    double depth;
    
    HiddingVar(double height,double width, double depth){
       
        this.height= height;
        this.width = width;
        this.depth = depth;
    }

     void displayinfo(){
        double Boxvolume;
        Boxvolume = height*width*depth;
        System.out.println("Volume: "+Boxvolume);
    }

}
class Anter{
public static void main(String[] args){
  
    HiddingVar box1 = new HiddingVar(10.0, 10.0, 10.0);
    box1.displayinfo();

    HiddingVar box2 = new HiddingVar(20, 030, 010);
    box2.displayinfo();

}
}