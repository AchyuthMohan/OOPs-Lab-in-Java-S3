import java.util.Random;

class first extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            Random rd=new Random();
            int x=rd.nextInt(100);
            if(x%2==0){
                second s=new second(x);
                s.start();
            }
            else{
                third t=new third(x);
                t.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class second extends Thread{
    int n;
    second(int n){
        this.n=n;
    }
    public void run(){
        System.out.println("Square: "+n*n);
    }
}
class third extends Thread{
    int n;
    third(int n){
        this.n=n;
    }
    public void run(){
        System.out.println("cube: "+n*n*n);
    }
}
public class demoThread {
    public static void main(String[] args) {
        first f=new first();
        f.start();
    }
}
