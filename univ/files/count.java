import java.io.*;
public class count {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("abc.txt");
            int ch;
            int word=1,c=0,nl=1;
            String s=new String();
            while((ch=fis.read())!=-1){
                char v=(char)ch;
                s+=v;
                
            }
            
            for(int i=0;i<s.length();i++){
                
                if(s.charAt(i)==' '){
                    word++;
                }
                else if(s.charAt(i)=='\n'){
                    nl++;
                }
                else{
                    c++;
                }
            }
            System.out.println("Words: "+word);
            System.out.println("Chars: "+c);
            System.out.println("New line: "+nl);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
