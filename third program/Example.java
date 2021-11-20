
import java.util.Scanner;



public class Example {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=input.nextLine();
        System.out.println("Enter the age: ");
        int age=input.nextInt();
        System.out.println("Enter the salary: ");
        float salary=input.nextFloat();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
