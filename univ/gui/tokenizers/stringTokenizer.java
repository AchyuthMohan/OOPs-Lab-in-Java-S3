import java.util.Scanner;
import java.io.*;
import java.util.*;
public class stringTokenizer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=new String();
        s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String k=st.nextToken();
            System.out.println(k);
        }
    }
}
