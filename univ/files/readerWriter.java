import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class readerWriter {
    public static void main(String[] args) {
        Reader fis=null;
        FileWriter fout=null;
        try{
            fis=new FileReader("file.txt");
            fout=new FileWriter("fileOut.txt");
            int  ch;
            String s=new String();
            s="";
            while((ch=fis.read())!=-1){
                // System.out.print((char)ch);
                char item=(char)ch;
                s+=item;
            }
            System.out.println(s);
            fout.write(s);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
