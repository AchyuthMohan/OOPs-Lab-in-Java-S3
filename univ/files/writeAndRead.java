import java.io.*;
import java.util.Scanner;
public class writeAndRead {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        FileInputStream fis=null;
        FileOutputStream fout=null;
        System.out.println("Enter the contents to be written into the file: ");
        str=sc.nextLine();

        try{
            fout=new FileOutputStream("outs.txt");
            int n=str.length();
            for(int i=0;i<n;i++){
                fout.write(str.charAt(i));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                fout.close();
            }
            catch(Exception e){
                
            }
            

        }
        try{
            fis=new FileInputStream("outs.txt");
            int ch;
            // ch=fis.read();
            while((ch=fis.read())!=-1){
                System.out.print((char)ch);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                fis.close();
            }
            catch(Exception e){

            }
           
        }
    }
}
