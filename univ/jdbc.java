import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM EMP");
            while(rs.next()){
                // int id=rs.getInt(1);
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ",rs.getDouble(3));

            }


        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                con.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}
