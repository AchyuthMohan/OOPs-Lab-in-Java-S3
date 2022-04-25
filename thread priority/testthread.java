import javax.print.event.PrintEvent;

class printer{
     void display(char ch){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
            
        
    }
}
class A extends Thread{
    printer p;
    A(printer p){
        this.p=p;
    }
    public void run(){
        p.display('a');
        
    }
}
class B extends Thread{
    printer p;
    B(printer p){
        this.p=p;
    }
    public void run(){
        p.display('b');
        
        }
    }

public class testthread {
    public static void main(String[] args) {
        printer pobj=new printer();
        A t1=new A(pobj);
        B t2=new B(pobj);
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
