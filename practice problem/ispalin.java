import java.util.Scanner;

public class ispalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        String s2=new String("");
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        if(s.equals(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome...");
        }
    }
}
