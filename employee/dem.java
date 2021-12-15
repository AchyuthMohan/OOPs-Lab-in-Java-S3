import java.util.Scanner;
class Employee{
    String name;
    int age;
    float sal;
    long phn;
    String address;
    void printSalary(){
         System.out.println("Salary: "+sal);
    }
}
class Officer extends Employee{
    String specialization;
}
class Manager extends Employee{
    String department;
}
public class dem{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        Manager emp1=new Manager();
        Officer emp2=new Officer();
        System.out.println("Enter manager details: ");
        System.out.println("Ente rthe name : ");
        String name1=input.nextLine();
        emp1.name=name1;
        System.out.println("age: ");
        int age1;
        age1=input.nextInt();
        emp1.age=age1;
        System.out.println("salary: ");
        float sal1;
        sal1=input.nextFloat();
        emp1.sal=sal1;
        System.out.println("address: ");
        System.out.println("department: ");


    }
}
