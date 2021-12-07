import java.util.Scanner;

public class palindrome {
   public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.println("Enter the string: ");
       String str;
       str=input.nextLine();
       int n=str.length();
       int i;
       String str2="";
       for(i=n-1;i>=0;i--){
           str2+=str.charAt(i);
       }
       System.out.println(str2);
       if(str.equals(str2)){
           System.out.println("Palindrome...");
       }
       else{
           System.out.println("Not palindrome..");
       }

   }
}
