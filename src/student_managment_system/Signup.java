/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_managment_system;

import DataBaseOperations.*;
import Design.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.Registrar;

/**
 *
 * @author ALazar
 */
public class Signup extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        maleRadioBtn.setActionCommand(null);
        femaleRadioBtn.setActionCommand(null);
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    public void validadtePassword() {
        String password = passwordTxt.getText();
        String confirmPassword = confirmPassTxt.getText();
        if (password == null ? confirmPassword != null : !password.equals(confirmPassword)) {
            passwordTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            confirmPassTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            passwordTxt.setToolTipText("Passwords doesn't match!");

        } else if (passwordTxt.getText().length() < 4 || confirmPassTxt.getText().length() < 4) {
            passwordTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            confirmPassTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            passwordTxt.setToolTipText("Password length must be greater than \'4\'");
            confirmPassTxt.setToolTipText("Password length must be greater than \'4\'");
        } else if (passwordTxt.getText().equals("") && confirmPassTxt.getText().equals("")) {
            passwordTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            confirmPassTxt.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            passwordTxt.setBorder(BorderFactory.createLineBorder(Color.white));
            confirmPassTxt.setBorder(BorderFactory.createLineBorder(Color.white));

        }
    }

    public void validateMobileNumber() {
        if (!mobileTxt.getText().matches(mobileNumberPattern)) {
            mobileTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            mobileTxt.setToolTipText("Mobile field on takes numbers.");
        } else {
            mobileTxt.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        }

    }

    public void clear() {
        firstNameTxt.setText("");
        lastNameTxt.setText("");
        emailTxt.setText("");
        mobileTxt.setText("");
        passwordTxt.setText("");
        confirmPassTxt.setText("");
        dateOfBirthTxt.setDate(null);
        buttonGroup1.setSelected(null, true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new PanelRound(100, 100, 0, 0);
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateOfBirthTxt = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        femaleRadioBtn = new javax.swing.JRadioButton();
        maleRadioBtn = new javax.swing.JRadioButton();
        signupBtn = new ButtonRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mobileTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        confirmPassTxt = new javax.swing.JPasswordField();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Registration Form");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 800));

        jPanel2.setBackground(new Color(216, 216, 216));
        jPanel2.setForeground(new java.awt.Color(63, 63, 65));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 671));

        firstNameTxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        firstNameTxt.setToolTipText("");
        firstNameTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        firstNameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameTxtFocusGained(evt);
            }
        });

        lastNameTxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lastNameTxt.setToolTipText("");
        lastNameTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        lastNameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameTxtFocusGained(evt);
            }
        });

        emailTxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        emailTxt.setToolTipText("");
        emailTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });
        emailTxt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                emailTxtInputMethodTextChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 63, 65));
        jLabel2.setText("Date of birth:");

        dateOfBirthTxt.setToolTipText("Enter YOur Date of birth");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 63, 65));
        jLabel3.setText("Please Fill In Your Information");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 63, 65));
        jLabel4.setText("Gender:");

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        femaleRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femaleRadioBtnMouseClicked(evt);
            }
        });

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        maleRadioBtn.setText("Male");
        maleRadioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maleRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maleRadioBtnMouseClicked(evt);
            }
        });

        signupBtn.setBackground(new java.awt.Color(63, 63, 65));
        signupBtn.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign Up");
        signupBtn.setBorder(null);
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnMouseClicked(evt);
            }
        });
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Already have an account?");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Sign In");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(63, 63, 65));
        jLabel7.setText("Last Name:");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(63, 63, 65));
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(63, 63, 65));
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(63, 63, 65));
        jLabel10.setText("First Name:");

        mobileTxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        mobileTxt.setToolTipText("");
        mobileTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        mobileTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobileTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileTxtFocusLost(evt);
            }
        });
        mobileTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileTxtKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(63, 63, 65));
        jLabel11.setText("Confirm Password:");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(63, 63, 65));
        jLabel12.setText("Mobile:");

        confirmPassTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        confirmPassTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPassTxtFocusGained(evt);
            }
        });
        confirmPassTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmPassTxtKeyReleased(evt);
            }
        });

        passwordTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTxtFocusGained(evt);
            }
        });
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel3))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel12)
                .addGap(19, 19, 19)
                .addComponent(mobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(15, 15, 15)
                .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(dateOfBirthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(maleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(femaleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jLabel6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addComponent(mobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(confirmPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(dateOfBirthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(maleRadioBtn)
                    .addComponent(femaleRadioBtn))
                .addGap(19, 19, 19)
                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)))
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 63, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome, Please Register Here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(498, 498, 498))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTxtFocusGained
        firstNameTxt.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_firstNameTxtFocusGained

    private void lastNameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTxtFocusGained
        lastNameTxt.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_lastNameTxtFocusGained

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        if (!emailTxt.getText().matches(emailPattern)) {
            emailTxt.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            emailTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        }
    }//GEN-LAST:event_emailTxtFocusGained

    private void mobileTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileTxtFocusGained
        mobileTxt.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_mobileTxtFocusGained

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        if (!firstNameTxt.getText().trim().isEmpty() && !lastNameTxt.getText().trim().isEmpty() && emailTxt.getText().matches(emailPattern) && !mobileTxt.getText().trim().isEmpty() && !passwordTxt.getText().trim().isEmpty() && !confirmPassTxt.getText().trim().isEmpty() && !(buttonGroup1.getSelection() == null) && !(dateOfBirthTxt.getDate() == null) && passwordTxt.getText().length() >= 4 && confirmPassTxt.getText().length() >= 4 && mobileTxt.getText().matches(mobileNumberPattern)) {
            Registrar rgr = new Registrar();
            rgr.setFirsrName(firstNameTxt.getText());
            rgr.setLastName(lastNameTxt.getText());
            rgr.setMobileNumber(mobileTxt.getText());
            rgr.setEmail(emailTxt.getText());
            rgr.setPassword(passwordTxt.getText());
            rgr.setDateOfBirth(dateOfBirthTxt.getDate().toString());
            rgr.setGender(buttonGroup1.getSelection().getActionCommand());
            RegistrarDao.save(rgr);
            clear();
            this.setVisible(false);
            new Login().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "All Fields must be filled correctly!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signupBtnActionPerformed

    private void passwordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusGained
        passwordTxt.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_passwordTxtFocusGained

    private void confirmPassTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPassTxtFocusGained
        confirmPassTxt.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_confirmPassTxtFocusGained

    private void mobileTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileTxtKeyReleased
        validateMobileNumber();
    }//GEN-LAST:event_mobileTxtKeyReleased

    private void passwordTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyReleased
        validadtePassword();
    }//GEN-LAST:event_passwordTxtKeyReleased

    private void confirmPassTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPassTxtKeyReleased
        validadtePassword();
    }//GEN-LAST:event_confirmPassTxtKeyReleased

    private void signupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseClicked
        validadtePassword();
    }//GEN-LAST:event_signupBtnMouseClicked

    private void maleRadioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maleRadioBtnMouseClicked
        maleRadioBtn.setActionCommand("Male");
    }//GEN-LAST:event_maleRadioBtnMouseClicked

    private void femaleRadioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femaleRadioBtnMouseClicked
        femaleRadioBtn.setActionCommand("Female");
    }//GEN-LAST:event_femaleRadioBtnMouseClicked

    private void emailTxtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_emailTxtInputMethodTextChanged
        if (!emailTxt.getText().matches(emailPattern)) {
            emailTxt.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            emailTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        }
    }//GEN-LAST:event_emailTxtInputMethodTextChanged

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        if (!emailTxt.getText().matches(emailPattern)) {
            emailTxt.setBorder(BorderFactory.createLineBorder(Color.red));
        } else {
            emailTxt.setBorder(BorderFactory.createLineBorder(Color.white));
        }
    }//GEN-LAST:event_emailTxtFocusLost

    private void mobileTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileTxtFocusLost
        validateMobileNumber();
    }//GEN-LAST:event_mobileTxtFocusLost

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmPassTxt;
    private com.toedter.calendar.JDateChooser dateOfBirthTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton signupBtn;
    // End of variables declaration//GEN-END:variables
}
