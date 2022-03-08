/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_esoft;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PRIMESH
 */
 public class DBConnection {
    
     public static Connection getConnection()
     {
         try 
        {
            String u="jdbc:mysql://localhost:3306/myprojectdb (1)";
            String name="root";
            String pass="";
            
            System.out.println("Trying to connect");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(u,name,pass);
            System.out.println("Connected Success");
            
            return con;
            
         } catch (Exception e) 
         {
             System.out.println(e.getMessage());
             return null;
         }
        
     }
     
}
