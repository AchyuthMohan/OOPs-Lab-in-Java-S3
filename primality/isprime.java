import java.util.Scanner;

public class isprime {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number: ");
        n=input.nextInt();
        int flag=0;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Not prime..");
        }
        else{
            System.out.println("Prime..");
        }
    }
}
