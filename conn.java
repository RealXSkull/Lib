/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.*;

/**
 *
 * @author zawat
 */
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","Password");  
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);  
        }
    }
}
