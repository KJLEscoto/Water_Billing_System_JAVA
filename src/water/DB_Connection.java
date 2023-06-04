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
       Class.forName("org.mariadb.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/water_billing", "root", "");
       JOptionPane.showMessageDialog(null,"Connected");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
        return con;
    }
    
}
