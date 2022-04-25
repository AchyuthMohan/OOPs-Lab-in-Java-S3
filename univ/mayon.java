import java.io.FileOutputStream;
import java.io.*;
// import javax.xml.catalog.Catalog;

class first extends Thread{
    int isprime(int c){
        int flag=0;
        for(int i=2;i<=Math.sqrt(c);i++){
            if(c%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void run(){
        FileInputStream fis=null;
        FileOutputStream fout =null;
        try{
            fis=new FileInputStream("f1.txt");
            fout=new FileOutputStream("f2.txt");
            int ch;
            while((ch=fis.read())!=-1){
                char item=(char)ch;
                String s="";
                s+=item;
                int n=Integer.parseInt(s);
                
                if(isprime(n)==1){
                    System.out.println(n);
                    fout.write(s.charAt(0));
                }
                
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class second extends Thread{

}

public class mayon {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fout=null;
        
        first f=new first();
        f.start();
        }

        
        
    
}
