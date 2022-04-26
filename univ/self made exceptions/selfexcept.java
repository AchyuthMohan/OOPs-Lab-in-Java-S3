import java.util.Scanner;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class selfexcept {
    static void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        n=sc.nextInt();
        try{
            if(n<1){
                throw new MyException("Small number");
            }
            else{
                System.out.println("Perfect number..");
            }
        }
        catch(Exception e){
            System.out.println(e);
            accept();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        accept();
        // n=sc.nextInt();
        
    }
}
