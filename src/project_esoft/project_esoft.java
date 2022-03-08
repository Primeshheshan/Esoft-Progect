package project_esoft;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PRIMESH
 */
public class project_esoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String u="jdbc:mysql://localhost:3306/myprojectdb";
            String name="root";
            String pass="";
            
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(u,name,pass);
            System.out.println("Connected Successfully");
        } catch (SQLException ex) {
            System.out.println("error");
        } catch (ClassNotFoundException ex) {
        }
    }
        // TODO code application logic here
    }
    

