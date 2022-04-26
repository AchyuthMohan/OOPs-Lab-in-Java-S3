import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;
import java.lang.*;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students: ");
        int n;
        n=sc.nextInt();
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampleDB","root","root");
            String sql="INSERT INTO USERS(rollno, name, CGPA) VALUES(???)";

            PreparedStatement statement=con.prepareStatement(sql);
            for(int i=0;i<n;i++){
                int r;
                String name;
                float c;
                System.out.println("Enter the rollno: ");
                r=sc.nextInt();
                System.out.println("Enter the name: ");
                name=sc.nextLine();
                System.out.println("Enter CGPA");
                c=sc.nextFloat();
                statement.setInt(1, r);
                statement.setString(2, name);
                statement.setFloat(3,c );
                
            }
            int rows=statement.executeUpdate();
            if(rows>0){
                System.out.println("success");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
