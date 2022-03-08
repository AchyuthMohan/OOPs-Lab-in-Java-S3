import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s;
        s=sc.nextLine();
        int  n=s.length();
        String s2="";
        for(int i=n-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        System.out.println("Reversed : "+s2);
        
    }
}
