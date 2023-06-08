package water;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kent
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class DB_Connection {
    
    public static Connection con(){
    Connection con = null;
    
    try{
       Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/water_billing_system", "root", "");
//       JOptionPane.showMessageDialog(null,"Connected");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Connect to Server First!", "Request Timeout", 2);
        System.exit(0);
    }
        return con;
    }

}
