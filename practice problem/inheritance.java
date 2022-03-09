
import java.util.Scanner;
class employee{
String name;
int age;
String phno;
String address;
float salary;
void printSalary(){
System.out.println("Salary: "+salary);
}
}
class officer extends employee{
String specilization;

}
class manager extends employee{
String department;


}

class inheritance{
public static void main(String []args){
Scanner input=new Scanner(System.in);
manager obj1=new manager();
officer obj2=new officer();
System.out.println("Enter the name of the manager: ");
String name1;
name1=input.nextLine();
obj1.name=name1;

System.out.println("Enter the phone: ");
String phone1;
phone1=input.nextLine();
obj1.phno=phone1;
System.out.println("Enter the address: ");
String add1;
add1=input.nextLine();
obj1.address=add1;

System.out.println("Enter the name of the officer: ");
String name2;
name2=input.nextLine();
obj2.name=name2;


System.out.println("Enter the phone: ");
String phone2;
phone2=input.nextLine();
obj2.phno=phone2;
System.out.println("Enter the address: ");
String add2;
add2=input.nextLine();
obj2.address=add2;
System.out.println("Enter the age of manager: ");
int age1;
age1=input.nextInt();
obj1.age=age1;
System.out.println("Enter the salary: ");
float sal1;
sal1=input.nextFloat();
obj1.salary=sal1;
System.out.println("Enter the age of officer: ");
int age2;
age2=input.nextInt();
obj2.age=age2;
System.out.println("Enter the salary of officer: ");
float sal2;
sal2=input.nextFloat();
obj2.salary=sal2;
System.out.println("Manager: ");
System.out.println("Name: "+obj1.name+" Age: "+obj1.age+" Phone: "+obj1.phno+" Salary: "+obj1.salary+" Address: "+obj1.address);
System.out.println("Officer: ");
System.out.println("Name: "+obj2.name+" Age: "+obj2.age+" Phone: "+obj2.phno+" Salary: "+obj2.salary+" Address: "+obj2.address);



}
}





