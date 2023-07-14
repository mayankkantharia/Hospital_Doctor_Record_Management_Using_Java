package hospital;
import java.sql.*;  
public class conn {
    Connection c;
    Statement s;
    public conn(){  
        try{    
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");    
            s =c.createStatement();      
        }catch(SQLException e){ 
            System.out.println(e);
        }  
    }  
}