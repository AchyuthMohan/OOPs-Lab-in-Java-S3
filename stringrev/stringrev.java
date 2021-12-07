import java.util.Scanner;

public class stringrev {
    public static void main(String[]args){
        String str,rever="";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string: ");
        str=input.nextLine();
        int n=str.length();
        int i;
        for(i=n-1;i>=0;i--){
            rever+=str.charAt(i);
        }
        System.out.println("Reversed: "+rever);
    }
}
