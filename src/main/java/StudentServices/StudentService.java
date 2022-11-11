/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentServices;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import StudentInformation.Student;

/**
 *
 * @author user
 */
public class StudentService {
    public void save(Student student) throws IOException{
        String sql = String.format(
        "INSERT INTO student(first_name, last_name, email, phone_number, major, date_of_birth, gender) VALUES ('%s','%s','%s','%s','%s','%s','%s')",
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getPhoneNumber(),
                student.getMajor(),
                student.getDateOfBirth(),
                student.getGender());
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
    
    public ArrayList<Student> getAll(){
        ArrayList<Student> data = new ArrayList<>();
        String sql = "SELECT * FROM student ORDER BY id";
        DatabaseService service = new DatabaseService();
        
        try(
                Connection conn = service.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ){
            while(rs.next()){
                data.add(
                    new Student(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getString("major"),
                        rs.getDate("date_of_birth"),
                        rs.getString("gender"))
                        
                );
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            return data;
        }
    }
    
    public void update(Student student, String column, String value){
        String sql = String.format(
                "UPDATE student SET %s='%s' WHERE id=%id",
                column,
                value,
                student.getId()
        );
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
    
}
