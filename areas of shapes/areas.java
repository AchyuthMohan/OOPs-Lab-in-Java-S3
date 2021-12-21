import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

class area{
    void area(float a,float b){
        System.out.println("Area of rectangle: "+a*b);
    }
    void area(float r){
        System.out.println("Area of circle: "+(22/7)*r*r);
    }
    void area(float x,float y,float z){
          float s=(x+y+z)/2;

          System.out.println("Area of triangle: "+Math.sqrt((s*(s-x)*(s-y)*(s-z))));
    }
}


public class areas{
    public static void main(String args[]){
        area obj=new area();
        Scanner input=new Scanner(System.in);
         System.out.println("1.Rectangle   2.Circle    3.triangle");
         int choice=input.nextInt();
         if(choice==1){
             System.out.println("Enter the dimensions...");
             float a,b;
             a=input.nextFloat();
             b=input.nextFloat();
             obj.area(a,b);
         }
         else if(choice==2){
            System.out.println("Enter the radius of circle: ");
            float r=input.nextFloat();
            obj.area(r);
    
         }
         else if(choice==3){
           float l,m,n;
           System.out.println("Enter the sides dimensions: ");
           l=input.nextFloat();
           m=input.nextFloat();
           n=input.nextFloat();
           obj.area(l,m,n);
         }
         else{
             System.out.println("Error");
         }
    }
    
}