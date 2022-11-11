package StudentInformation;

import java.util.Date;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String major;
    private Date dateOfBirth;
    private String gender;

    //constructor
    public Student() {
        //...
    }


    public Student(String firstname, String lastname, String email, String phone_number, String major, Date date_of_birth, String gender) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.phoneNumber = phone_number;
        this.major = major;
        this.dateOfBirth = date_of_birth;
        this.gender = gender;
        
    }
    
    
    public Student(int id, String firstname, String lastname, String email, String phone_number, String major, Date date_of_birth, String gender) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.phoneNumber = phone_number;
        this.major = major;
        this.dateOfBirth = date_of_birth;
        this.gender = gender;
        
    }


    /**
     * @return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * @param ID the ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastNmae
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastNmae the lastNmae to set
     */
    public void setLastName(String lastNmae) {
        this.lastName = lastNmae;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getName() {
        return getFirstName() + getLastName(); 
    }

}
