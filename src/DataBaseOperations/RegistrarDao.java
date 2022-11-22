/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseOperations;

import javax.swing.JOptionPane;
import model_classes.Registrar;
import java.sql.*;
/**
 *
 * @author ALE
 */
public class RegistrarDao {

    public static void save(Registrar rgr) {
        String query = "insert into registrar(first_name, last_name, email, mobileNumber, password, dateOfBirth, Gender) values('" + rgr.getFirsrName() + "','" + rgr.getLastName() + "','" +  rgr.getEmail()+ "','" + rgr.getMobileNumber() + "','" + rgr.getPassword() + "','" + rgr.getDateOfBirth() +"','"+ rgr.getGender()+"')";
        DbOperations.setDataOrDelete(query, "Registered Successfully!");
    }

    public static Registrar login(String email, String password) {
        Registrar rgr = null;
        try {
            ResultSet rs = DbOperations.getData("select * from registrar where email='" + email + "' and password = '" + password + "'");
            while (rs.next()) {
                rgr = new Registrar();
                rgr.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rgr;
    }


    public static void update(String email, String newPassword) {
        String query = "update registrar set password ='" + newPassword + "' where email = '" + email + "'";
        DbOperations.setDataOrDelete(query, "Your password Updated Successfully.😎");
    }

}
