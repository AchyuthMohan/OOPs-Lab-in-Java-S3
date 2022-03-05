import java.util.Scanner;

class Employee{
    String name;
    int age;
    float sal;
    String address;
    String phno;
    void printSalary(){
        System.out.println(this.sal);
    }


}
class Manager extends Employee{
    String department;
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.sal);
        System.out.println("phno: "+this.phno);
        System.out.println("Address: "+this.address);
        System.out.println("Department: "+this.department);
    }
}
class Officer extends Employee{
    String specialization;
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.sal);
        System.out.println("phno: "+this.phno);
        System.out.println("Address: "+this.address);
        System.out.println("specialization: "+this.specialization);
    }

}
class inheritance{
    public static void main(String args[]){
        Manager m=new Manager();
        Officer o=new Officer();
        Scanner sc =new Scanner(System.in);
        System.out.println("Manager details: ");

        System.out.println("Enter the name: ");
        m.name=sc.nextLine();
        System.out.println("address: ");
        m.address=sc.nextLine();
        System.out.println("Enter the age: ");
        m.age=sc.nextInt();
        System.out.println("Salary : ");
        m.sal=sc.nextFloat();
        
        System.out.println("Phno: ");
        m.phno=sc.nextLine();
        System.out.println("Enter the department: ");
        m.department=sc.nextLine();

        System.out.println("officer details: ");
        System.out.println("Enter the name: ");
        o.name=sc.nextLine();
        System.out.println("address: ");
        o.address=sc.nextLine();
        System.out.println("Enter the age: ");
        o.age=sc.nextInt();
        System.out.println("Salary : ");
        o.sal=sc.nextFloat();

       
        System.out.println("Phno: ");
        o.phno=sc.nextLine();
        System.out.println("specialization: ");
        o.specialization=sc.nextLine();
        System.out.println("manager details: ");
        m.display();

        System.out.println("officer details: ");
        o.display();
        

    }
}