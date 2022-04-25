import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        // String path="output.txt";
        Scanner sc=new Scanner(System.in);
        FileOutputStream fout=null;
        try{
            fout=new FileOutputStream("outputs.txt");
            System.out.println("Enter the contents: ");
            String data=new String();
            data=sc.nextLine();
            byte b[]=data.getBytes();
            fout.write(b);
            System.out.println("Written succesfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                if(fout!=null){
                    fout.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
