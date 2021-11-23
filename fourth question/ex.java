import java.util.Scanner;

public class ex {
    public static void main(String[] args){
        int n,sum=0;
        System.out.println("Enter the number: ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        while(n!=0){
             sum+=n%10;
             n=n/10;
        }
        System.out.println("Sum: "+sum);
    }
}
