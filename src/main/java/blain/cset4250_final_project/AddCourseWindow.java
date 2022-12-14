/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blain.cset4250_final_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bahls
 */
public class AddCourseWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddCourseWindow
     */
    public AddCourseWindow() {
        NewInitComponents();
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
        NewCourseTitleTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RequestedStudentsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Add Course Window");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Course Title");

        NewCourseTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCourseTitleTextFieldActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("<html>Existing students to enroll in requested course:<br> (Please use a comma to separate multiple usernames)</html>");

        RequestedStudentsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestedStudentsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(SubmitButton))
                    .addComponent(RequestedStudentsTextField)
                    .addComponent(NewCourseTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewCourseTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RequestedStudentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(SubmitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewInitComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NewCourseTitleTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RequestedStudentsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Add Course Window");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Course Title");

        NewCourseTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCourseTitleTextFieldActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("<html>Existing students to enroll in requested course:<br> (Please use a comma to separate multiple usernames)</html>");

        RequestedStudentsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestedStudentsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(CancelButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(SubmitButton))
                                        .addComponent(RequestedStudentsTextField)
                                        .addComponent(NewCourseTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewCourseTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RequestedStudentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CancelButton)
                                        .addComponent(SubmitButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        this.setLocationRelativeTo(null);
    }

    private void NewCourseTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCourseTitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewCourseTitleTextFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void RequestedStudentsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestedStudentsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RequestedStudentsTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        DefaultTableModel model;
        model = MainPage.getjTable1Model();
        HashSet<String> InitialCourses = MainPage.getInitialCourses();
        HashSet<String> InitialStudents = MainPage.getInitialStudents();
        JDialog dialog;

        String[] tempArray = RequestedStudentsTextField.getText().split(", ");
        List<String> requestedStudents = new ArrayList<String>(Arrays.asList(tempArray));

        String RequestedCourse = NewCourseTitleTextField.getText();

        if (RequestedCourse.isBlank()) {
            dialog = new JDialog(this, "Course Title field is blank.", true);
            JLabel label = new JLabel("Course Title field is blank.", SwingConstants.CENTER);
            label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            dialog.add(label);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        } else if (RequestedStudentsTextField.getText().isBlank()) {
            dialog = new JDialog(this, "Existing username(s) field is blank.", true);
            JLabel label = new JLabel("Existing username(s) field is blank.", SwingConstants.CENTER);
            label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            dialog.add(label);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        } else {
            if (InitialCourses.contains(RequestedCourse)) {
                dialog = new JDialog(this, "The requested course is already present in the gradebook.", true);
                JLabel label = new JLabel("The requested course  (" + RequestedCourse + ")  is already present in the gradebook.", SwingConstants.CENTER);
                label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                dialog.add(label);
                dialog.pack();
                dialog.setLocationRelativeTo(this);
                dialog.setVisible(true);
            } else {
                for (String student : requestedStudents) {
                    if (InitialStudents.contains(student)) {
                        Vector row = new Vector(7);
                        row.add(RequestedCourse);
                        row.add("null");
                        row.add("null");
                        row.add(student);
                        row.add("null");
                        row.add("null");
                        model.addRow(row);
                    } else {
                        dialog = new JDialog(this, "Requested username(s) does not exist.", true);
                        JLabel label = new JLabel("The requestred username (" + student + ") does not exist.", SwingConstants.CENTER);
                        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                        dialog.add(label);
                        dialog.pack();
                        dialog.setLocationRelativeTo(this);
                        dialog.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourseWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField NewCourseTitleTextField;
    private javax.swing.JTextField RequestedStudentsTextField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
