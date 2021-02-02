/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ken_0
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Hospital_management","root","root");
            return conn;
        }catch(Exception e){
            return null;
        }
    }
}
