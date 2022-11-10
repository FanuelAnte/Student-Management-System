/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseOperations;

import java.sql.*;

/**
 *
 * @author ALE
 */
public class ConnectionProvider {
    

    public static Connection getCon() {
        try {
//            Class.forName("com.postgresql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "32120832asdASD!@#");
            return con;
        } catch (Exception e) {
            return null;
        }
        
    }

}
