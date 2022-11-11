/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseOperations;

import javax.swing.JOptionPane;

/**
 *
 * @author ALE
 */
public class Tables {
    public static void main(String[] args){
        try{
            String registrarTable = "create table registrar(id int AUTO_INCREMENT PRIMARY KEY, first_name varchar(200), last_name varchar(200), email varchar(200), mobileNumber varchar(200), password varchar(200), dateOfBirth varchar(200), Gender varchar(200), UNIQUE (email))";
            DbOperations.setDataOrDelete(registrarTable, "Registrar Table created successfully");
//            String adminDetails = "insert into user(name,email,mobileNumber,address,password, securityQuestion, answer, status) values('Alazar','alazar3@gmail.com','0968272920','Ethiopia','alazar','Who are you?','I am you','true')";
//            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfuly");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    
    
}
