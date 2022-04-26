import java.io.FileInputStream;
import java.io.FileOutputStream;

public class readFromoneAndwrite {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fout=null;
        try{
            fis=new FileInputStream("abc.txt");
            fout=new FileOutputStream("ghf.txt");
            int ch;
            while((ch=fis.read())!=-1){
                fout.write(ch);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                fis.close();
                fout.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
