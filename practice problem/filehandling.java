import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class filehandling{
    public static void main(String[] args) {
        String path="Output.txt";
        Reader reader=null;
        Writer writer=null;
        Scanner sc=new Scanner(System.in);
        try{
            reader=new FileReader(path);
            String data="";
            int ch=reader.read();
                while(ch!=-1){
                    data+=(char)ch;
                    ch=reader.read();
                }//while
            if(data==""){
                System.out.println(path+"is empty");
            }
            else{
                System.out.println("Read contents: "+data);
            }
            }//try
            catch(Exception e){
                System.out.println(e);
            }//catch
            finally{
                try{
                    if(reader!=null)
                        reader.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }//finally

            try{
                writer =new FileWriter(path);
                System.out.println("Enter the contents to be written: ");
                String s=new String();
                s=sc.nextLine();
                writer.write(s);

            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                if(writer!=null){
                    writer.close();
                }
                
            }
        }//main

    }//class
