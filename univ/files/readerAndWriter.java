import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
public class readerAndWriter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=new String();
        s=sc.nextLine();
        Reader fis=null;
        Writer fout=null;
        try{
            fout=new FileWriter("new.txt");
            
            fout.write(s);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            fis=new FileReader("new.txt");
            int ch;
            while((ch=fis.read())!=-1){
                System.out.print((char)ch);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
