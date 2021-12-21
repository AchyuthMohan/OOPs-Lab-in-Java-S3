 
class testGarbage{
    public void finalize(){
        System.out.println("Garbage collected...");
    }
}
public class garbage {
    public static void main(String args[]){
        testGarbage s1=new testGarbage();
        testGarbage s2=new testGarbage();
        s1=null;
        s2=null;
        System.gc();
       
    }
   
}
 

