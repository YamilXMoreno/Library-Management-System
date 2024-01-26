package Project;

import java.sql.*; /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xboxV
 */
public class ConnectionProvider {
    public static Connection GetCon() {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/library_management_system", "root", "1234");
            return con;
        }
        catch (Exception e){
            System.out.println(e) ;
            return null;
        }
    }
}

