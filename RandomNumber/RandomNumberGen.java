import java.util.Random;

 public class RandomNumber extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            Random rd=new Random();
            int randomInteger=rd.nextInt(100);
            System.out.println("Randm Number generated: "+randomInteger);
            if((randomInteger%2)==0){
                SquareThread sThread=new SquareThread(randomInteger);
                sThread.start();
            }
            else{
                CubeThread cThread=new CubeThread(randomInteger);
                cThread.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

        }
    }
}

class SquareThread extends Thread{
    int number;
    SquareThread(int randomNumbern){
        number=randomNumbern;
    }
    public void run(){
        System.out.println("Square of "+number+"= "+(number*number));
    }
}
class CubeThread extends Thread{
    int number;
    CubeThread(int randomNumbern){
        number=randomNumbern;

    }
    public void run(){
        System.out.println("Cube of "+number+"= "+(number*number*number));
    }
}
public class RandomNumberGen{
    public  static void main(String args[]) {
        RandomNumber rn=new RandomNumber();
        rn.start();
    }
}