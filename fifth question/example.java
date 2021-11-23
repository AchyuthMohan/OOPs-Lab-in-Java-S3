import java.util.Scanner;

public class example {
    public static void main(String[] args){
        int max=0,a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the limit");
       int n=input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the number: ");
            a=input.nextInt();
            if(max<a){
                max=a;
            }
        }
        System.out.println("Largest: "+max);
    }
}
