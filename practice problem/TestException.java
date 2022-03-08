import java.util.Scanner;

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
public class TestException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            int n;
            n=sc.nextInt();
            if(n>10){
                throw new MyException("Number is too large");
            }
            else{
                System.out.println("Perfect number");
            }

            }
            catch(MyException e){
                System.out.println("Caught the error: ");
                System.out.println(e.getMessage());
            }
    }
      
}
