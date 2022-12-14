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
public class AddNewStudentWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddStudentWindow
     */
    public AddNewStudentWindow() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsernamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CoursesjTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        jLabel4.setText("Student Username already present in gradebook.");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel4)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 300));
        setMinimumSize(new java.awt.Dimension(800, 300));
        setPreferredSize(new java.awt.Dimension(800, 300));
        setSize(new java.awt.Dimension(800, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Add New Student Window");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Student's Username");

        UsernamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamejTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Course(s) the student is enrolling in (Please use \", \" to separate courses; eg CSET4250, ENGT4050)");

        CoursesjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoursesjTextFieldActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CoursesjTextField)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(UsernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CoursesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewInitComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsernamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CoursesjTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        jLabel4.setText("Student Username already present in gradebook.");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)
                                .addContainerGap(91, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel4)
                                .addContainerGap(158, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 300));
        setMinimumSize(new java.awt.Dimension(800, 300));
        setPreferredSize(new java.awt.Dimension(800, 300));
        setSize(new java.awt.Dimension(800, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Add New Student Window");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Student's Username");

        UsernamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernamejTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Course(s) the student is enrolling in (Please use \", \" to separate courses; eg CSET4250, ENGT4050)");

        CoursesjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoursesjTextFieldActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(CoursesjTextField)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(UsernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CoursesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CancelButton))
                                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        this.setLocationRelativeTo(null);
    }

    private void UsernamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernamejTextFieldActionPerformed

    private void CoursesjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoursesjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoursesjTextFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        DefaultTableModel model;
        model = MainPage.getjTable1Model();
        HashSet<String> InitialCourses = MainPage.getInitialCourses();
        JDialog dialog;

        int initialModelRowCount = model.getRowCount();

        String[] tempArray = CoursesjTextField.getText().split(", ");
        List<String> requestedCourses = new ArrayList<String>(Arrays.asList(tempArray));

        String Username = UsernamejTextField.getText().replaceAll("\\s+", "");

        if (Username.isBlank()) {
            dialog = new JDialog(this, "Student Username field is blank.", true);
            JLabel label = new JLabel("Student Username field is blank.", SwingConstants.CENTER);
            label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            dialog.add(label);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        } else if (CoursesjTextField.getText().isBlank()) {
            dialog = new JDialog(this, "Course(s) field is blank.", true);
            JLabel label = new JLabel("Course(s) field is blank.", SwingConstants.CENTER);
            label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            dialog.add(label);
            dialog.pack();
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        } else {
            for (String course : requestedCourses) {
                if (InitialCourses.contains(course)) {
                    HashSet<String> Students = new HashSet<String>();
                    for (int i = 0; i < initialModelRowCount; i++) {
                        if (course.equals(model.getValueAt(i, 0).toString())) {
                            Students.add(model.getValueAt(i, 3).toString());
                        }
                    }
                    if (Students.contains(Username)) {
                        dialog = new JDialog(this, "Username already enrolled in course.", true);
                        JLabel label = new JLabel("<html>A student with the Username " + Username + " is already enrolled in " + course + "."
                                + "<br/> Close this window to skip " + course + " and proceed through the list of courses. </html>", SwingConstants.CENTER);
                        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                        dialog.add(label, SwingConstants.CENTER);
                        dialog.pack();
                        dialog.setLocationRelativeTo(this);
                        dialog.setVisible(true);
                    } else {
                        HashSet CourseAssignments = new HashSet<String>();
                        for (int j = 0; j < initialModelRowCount; j++) {
                            if (course.equals(model.getValueAt(j, 0).toString())) {
                                if (CourseAssignments.isEmpty()) {
                                    CourseAssignments.add(model.getValueAt(j, 2));
                                    Vector row = new Vector(7);
                                    row.add(model.getValueAt(j, 0));
                                    row.add(model.getValueAt(j, 1));
                                    row.add(model.getValueAt(j, 2));
                                    row.add(UsernamejTextField.getText());
                                    row.add("null");
                                    row.add("null");
                                    model.addRow(row);
                                    this.dispose();
                                } else {
                                    if (!CourseAssignments.contains(model.getValueAt(j, 2))) {
                                        CourseAssignments.add(model.getValueAt(j, 2));
                                        Vector row = new Vector(7);
                                        row.add(model.getValueAt(j, 0));
                                        row.add(model.getValueAt(j, 1));
                                        row.add(model.getValueAt(j, 2));
                                        row.add(UsernamejTextField.getText());
                                        row.add("null");
                                        row.add("null");
                                        model.addRow(row);
                                        this.dispose();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    dialog = new JDialog(this, "Course is not present in gradebook.", true);
                    JLabel label = new JLabel("The requested course (" + course + ") is not present in gradebook.", SwingConstants.CENTER);
                    label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                    dialog.add(label);
                    dialog.pack();
                    dialog.setLocationRelativeTo(this);
                    dialog.setVisible(true);
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
                new AddNewStudentWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField CoursesjTextField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField UsernamejTextField;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
