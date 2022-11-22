/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI_and_TableModels;

import model_classes.*;
import Services.TranscriptService;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Design.*;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nonyx
 */
public class TranscriptFrame extends javax.swing.JInternalFrame {

    TranscriptTableModel model;
    StudentInformationFrame studentInformationFrame = new StudentInformationFrame();
    /**
     * Creates new form TranscriptFrame
     */
    ArrayList<String> courseTitle = new ArrayList<String>();

    public TranscriptFrame() {
        model = new TranscriptTableModel();
        TranscriptService service = new TranscriptService();
        model.transcripts = service.getAll();
        initComponents();

        studentNameField.setText(StudentInformationFrame.foreign_name);
        studentIDField.setText(Integer.toString(StudentInformationFrame.foreign_id));
        if (!studentNameField.getText().equals("")) {
            studentNameField1.setText(StudentInformationFrame.foreign_name);

        } else {
            studentNameField1.setText("No Student Chosen!");
        }

        courseTitle.add("Introduction to Computer Systems");
        courseTitle.add("Fundementals of programmign");
        courseTitle.add("Discrete Mathematics");
        courseTitle.add("College English");
        courseTitle.add("Introduction to Logic & Critical Thinking");
        courseTitle.add("Geography of Ethiopia & the horn");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        backButton = new ButtonRound();
        printButton = new ButtonRound();
        jLabel3 = new javax.swing.JLabel();
        credithourField = new javax.swing.JTextField();
        lettergradeField = new javax.swing.JTextField();
        gradepointField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enterButton = new ButtonRound();
        studentNameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        studentNameField1 = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Student Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 115, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 149, -1, -1));

        studentIDField.setEditable(false);
        getContentPane().add(studentIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 143, 89, -1));

        jPanel1.setBackground(new java.awt.Color(216, 216, 216));

        ButtonRound backButton = new ButtonRound();
        backButton.setRadius(40);
        backButton.setBackground(new java.awt.Color(63, 63, 65));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ButtonRound printButton = new ButtonRound();
        printButton.setRadius(40);
        printButton.setBackground(new java.awt.Color(63, 63, 65));
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print");
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Credit Hour");

        jLabel5.setText("Grade Point");

        jLabel4.setText("Letter Grade");

        ButtonRound enterButton = new ButtonRound();
        enterButton.setRadius(40);
        enterButton.setBackground(new java.awt.Color(63, 63, 65));
        enterButton.setForeground(new java.awt.Color(255, 255, 255));
        enterButton.setText("Enter");
        enterButton.setToolTipText("Filter the student below first");
        enterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        studentNameField.setEditable(false);
        studentNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(63, 63, 63));
        jLabel6.setText("Click to Filter Information of: ");
        jLabel6.setToolTipText("Click here to filter Individual students data before entering information based on the student name ");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);

        studentNameField1.setEditable(false);
        studentNameField1.setBackground(new java.awt.Color(216, 216, 216));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(credithourField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lettergradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gradepointField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(credithourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lettergradeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gradepointField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(studentNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        if (credithourField.getText().equals("") && lettergradeField.getText().equals("") && gradepointField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Credit hour, Letter grade and Grade point are required");
        } else {
            TranscriptService service = new TranscriptService();
            Transcript transcript = new Transcript(studentIDField.getText(), courseTitle.get(model.transcripts.size()), Integer.parseInt(credithourField.getText()), lettergradeField.getText().charAt(0), Integer.parseInt(gradepointField.getText()));
            try {
                service.save(transcript);
            } catch (IOException ex) {
                //...
            }
            model.transcripts = service.getSingle(studentIDField.getText());
            model.fireTableDataChanged();
            credithourField.setText("");
            lettergradeField.setText("");
            gradepointField.setText("");
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        JInternalFrame sf = new StudentInformationFrame();
        sf.setVisible(true);
        getParent().add(sf);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    @SuppressWarnings("empty-statement")
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        if (studentNameField.getText().equals("") || studentIDField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You have to chose a student first! Go Back.");
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Choose your file path");
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                //I have added some file handling concept here. What do you say???
                try {
                    FileWriter fw = new FileWriter(fileToSave);
                    BufferedWriter bw = new BufferedWriter(fw);

                    bw.write("ID-" + studentIDField.getText() + ": " + studentNameField.getText() + "\n");
                    bw.write(new TranscriptTableModel().getColumnNames());
                    bw.newLine();
                    for (int i = 0; i < jTable1.getRowCount(); i++) {
                        for (int j = 0; j < jTable1.getColumnCount(); j++) {
                            //write
                            bw.write(jTable1.getValueAt(i, j).toString() + ",");
                        }
                        bw.newLine();//record per line 
                    }
                    JOptionPane.showMessageDialog(this, "SUCCESSFULLY SAVED", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "ERROR", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        TranscriptService service = new TranscriptService();
        model.transcripts = service.getSingle(studentIDField.getText());
        model.fireTableDataChanged();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void studentNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TranscriptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranscriptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranscriptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranscriptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranscriptFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField credithourField;
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField gradepointField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lettergradeField;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JTextField studentNameField;
    private javax.swing.JTextField studentNameField1;
    // End of variables declaration//GEN-END:variables
}