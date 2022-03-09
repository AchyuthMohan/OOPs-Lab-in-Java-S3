import java.io.*;   
class Student implements Serializable{  
    int id;  
    String name;  
    public Student(int id, String name) {  
     this.id = id;  
     this.name = name;  
    }  
   }   
class Persist{    
 public static void main(String args[]){    
  try{    
   
  Student s1 =new Student(211,"ravi");    
  
  FileOutputStream fout=new FileOutputStream("output.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();    
  
  out.close();    
  System.out.println("success");    
  }catch(Exception e){System.out.println(e);} 
  try{
      FileInputStream fis=new FileInputStream("output.txt");
      int ch;
      while((ch=fis.read())!=-1){
          System.out.println(ch);
      }

  } 
  catch(Exception e){
      System.out.println(e);
  } 
  finally{
      fis.close();
  } 
 }    
} 