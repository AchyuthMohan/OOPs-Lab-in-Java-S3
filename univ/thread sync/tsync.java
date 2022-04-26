import java.util.Random;

class first extends Thread{
    public void run(){
        Random rd=new Random();
        for(int i=0;i<10;i++){
            int x=rd.nextInt(100);
            if(x%2==0){
                square s=new square(x);
                s.start();
            }
            else{
                cube c=new cube(x);
                c.start();
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
class square extends Thread{
    int x;
    square(int x){
        this.x=x;

    }
    public void run(){
        System.out.println("Square: "+x*x);
    }
}

class cube extends Thread{
    int x;
    cube(int x){
        this.x=x;
    }
    public void run(){
        System.out.println("Cube : "+x*x*x);
    }
}
public class tsync {
    public static void main(String[] args) {
        first f=new first();
        f.start();
    }
}
