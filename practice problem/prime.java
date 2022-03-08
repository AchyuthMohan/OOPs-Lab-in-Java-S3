import java.util.Scanner;

public class prime {
    static void isprime(int n){
        int i=2;
        int flag=0;
        for(;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime number..");

        }
        else{
            System.out.println("Not a prime number..");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        n=sc.nextInt();
        isprime(n);


    }
}
