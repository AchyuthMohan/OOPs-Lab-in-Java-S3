import java.io.*;
class readerWriter{
    public static void main(String[] args) {
        Reader fis=null;
        try{
            fis=new FileReader("abc.txt");
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