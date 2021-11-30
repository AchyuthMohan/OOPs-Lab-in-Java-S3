import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
         String str;
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the the string");
         str=input.nextLine();
         int n=str.length();
         
         
         int i,ctr=0;
         System.out.println("Enter the character to be found: ");
         char ch=input.next().charAt(0);
         for(i=0;i<n;i++){
             if(str.charAt(i)==ch){
                 ctr++;
             }
         }
         System.out.println(ctr +"times");
    }
}
