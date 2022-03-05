import java.lang.Thread;
import java.util.Random;
class thread1 extends Thread{
    public void run(){
        Random rd=new Random();
        int i=0;
        while(i<10){
            int n=rd.nextInt(100);
         
            if(n%2==0){
                thread2 t2=new thread2(n);
                t2.start();
            }
            else if(n%2==1){
                thread3 t3=new thread3(n);
                t3.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
       
    }
}
class thread2 extends Thread{
    int n;
    thread2(int n){
        this.n=n;
    }
    public void run(){
        System.out.println("Square: "+n*n);
    }
}
class thread3 extends Thread{
    int n;
    thread3(int n){
        this.n=n;
    }
    public void run(){
        System.out.println("Cube: "+n*n*n);
    }
}
public class Threads {
    public static void main(String[] args) {
        thread1 t=new thread1();
        t.start();
    }
}
