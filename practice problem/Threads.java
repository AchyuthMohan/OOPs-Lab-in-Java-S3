import java.util.Random;
import java.lang.Thread;
class thread1 extends Thread{
    public void run(){
        Random rd=new Random();
        for(int i=0;i<10;i++){
            int r=rd.nextInt(100);
            if(r%2==0){
                thread2 t2=new thread2(r);
                t2.start();
            }
            else{
                thread3 t3=new thread3(r);
                t3.start();
            }
            try{
                this.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
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
public class Threads{
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
    }
}