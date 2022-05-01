import java.sql.*;
public class Conn {
    public static Connection getCon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
            return con;
//  To check for Connection Establishment
//            if(con!=null){
//                System.out.println("Connection Done : "+con);
//            }
//            else{
//                System.out.println("Failed");
//            }
        }
        catch(Exception ex){
//            System.out.println("Exception is : "+ex.toString());
            return null;
        }
    }
//    public static void main(String[] args) {
//        Conn.getCon();
//    }
}