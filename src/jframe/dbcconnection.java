
package jframe;

import java.sql.*;
public class dbcconnection {
      static Connection con= null;
   
   
    public static Connection getConnection(){
        
     
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms", "root", "root");
           
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
}
}
