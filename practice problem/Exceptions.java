import java.lang.Exception;
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
        int n;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        if(n>12){
            throw new MyException("big number");
        }
        else{
            System.out.println("Perfect number");
        }

    }
    catch(MyException e){
       System.out.println(e);
    }
}
    }
    