import java.util.Scanner;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
public class Exceptions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=5;
            System.out.println("Enter a number to divide 5: ");
           int n=sc.nextInt();
           int c=a/n;
           if(c<2){
               throw new MyException("Number has became too small...");
           }
           else{
               System.out.println("result: "+c);
           }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("all done");
        }
    }
}