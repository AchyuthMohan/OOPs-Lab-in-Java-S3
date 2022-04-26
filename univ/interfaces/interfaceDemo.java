import java.io.*;
import java.lang.*;
interface person{
   public void display();

}
class student implements person{
    int rno;
    String name;
    student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    public void display(){
        System.out.println(rno+" "+name);
    }
}
class staff implements person{
    int sno;
    String name;
    staff(int sno,String name){
        this.sno=sno;
        this.name=name;
    }
    public void display(){
        System.out.println(sno+" "+name);
    }

}

public class interfaceDemo {
    public static void main(String[] args) {
        student s=new student(1,"arun");
        staff st=new staff(2,"varun");
        s.display();
        st.display();
    }
}
