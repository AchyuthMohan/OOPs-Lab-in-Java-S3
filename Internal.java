import java.lang.Math;
import java.io.*;
class TwoD{
    int x;
    int y;
    TwoD(int x,int y){
        this.x=x;
        this.y=y;
    }
    void dist(int x,int y){
        int distance=(int)Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
        System.out.println("Distance between (" + x + ", " + y + ") and (" + this.x + ", " + this.y + ") is " + distance);
    }
    void dist(TwoD p){
        int distance=(int)Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
        System.out.println("Distance between (" + p.x + ", " + p.y +  ") and (" + this.x + ", " + this.y+") is " + distance);
    }
    void dist(int x,int y,int z){
        int distance=(int)Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)+Math.pow(z,2));
        System.out.println("Distance between (" + x + ", " + y +","+z+ ") and (" + this.x + ", " + this.y +","+0+ ") is " + distance);
    }
   
}
class threeD extends TwoD{
    int z;
    threeD(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
    void dist(int x,int y,int z){
        int distance=(int)Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)+Math.pow(z-this.z, 2));
        System.out.println("Distance between (" + x + ", " + y + ", " + z + ") and (" + this.x + ", " + this.y + ", " + this.z + ") is " + distance);
    }
    void dist(threeD p){
        int distance=(int)Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2)+Math.pow(p.z-this.z, 2));
        System.out.println("Distance between (" + p.x + ", " + p.y + ", " + p.z + ") and (" + this.x + ", " + this.y + ", " + this.z + ") is " + distance);
    }
    void dist(int x,int y){
        int distance=(int)Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)+Math.pow(0-this.z, 2));
        System.out.println("Distance between (" + x + ", " + y + ", " + 0 + ") and (" + this.x + ", " + this.y + ", " + this.z + ") is " + distance);
    }
}


public class Internal { //Main Class of Java Program
    public static void main() {   //Main Function
        System.out.println("We have 2 points on 2D with (1,2) and (3,4) as values..");

        TwoD t1=new TwoD(1, 2); //Object Creation for 2D points
        TwoD t2=new TwoD(3, 4);
        System.out.println("Distances from different points: ");
        System.out.println("For point (1,2): ");
        t1.dist(12, 10);
        t1.dist(9, 8);
        System.out.println("For point (3,4): ");
        t2.dist(12,10);
        t2.dist(4, 5);
        // System.out.println("Distances from different points for 3D point: ");
        System.out.println("We have two points on 3D (1,2,3) and (4,5,6)");
        threeD t3=new threeD(1,2,3);    //Object Creation for 3D points
        threeD t4=new threeD(4,5,6);
        System.out.println("Distances from different points for 3D point: ");
        System.out.println("For point (1,2,3): ");
        t3.dist(2,6,8);
        t3.dist(1,2,0);                         //passing as points
        threeD p=new threeD(9, 8, 0);
        t3.dist(p);                            //passing as object
        t3.dist(1,2);                          //passing as two points so that the z coordinate of the 
                                               //passed value will be set to 0 
    }
}
