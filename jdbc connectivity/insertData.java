import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertData {
    public static void main(String[] args) {
        try{
            Class.ForName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SampleDb","root","root");
            String sql="INSERT INTO Users(username,password,email)VALUES(???)";
            PreparedStatement statement=con.prepareStatement(sql);
            statement.setString(1, "BillGates");
            statement.setString(2, "1234");
            statement.setString(3, "bill.gates@microsoft.com");
            int val=statement.executeUpdate();
            con.close();
            if(val>0){
                System.out.println("new row created..");

            }
            else{
                System.out.println("no new row created..");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
