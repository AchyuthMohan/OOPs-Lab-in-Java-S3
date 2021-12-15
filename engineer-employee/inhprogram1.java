import java.util.Scanner;

class Employee{
void display()
{
System.out.println("Name of the class is Employee");
}

void calcSalary()
{System.out.println("\nSalary of the employee is 10000");
}
}

class Engineer extends Employee{
void calcSalary()
{System.out.println("\nSalary of the employee is 20000");
}
}

public class inhprogram1{
public static void main(String args[])
{
Engineer emp1 = new Engineer();
emp1.display();
emp1.calcSalary();
}}
