/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.HeadOfDepartment;

import Business.Business;
import Department.Department;
import UI.MainJFrame;
import UI.SystemAdminPanel.DepartmentJPanel;
import UserAccounts.UserAccounts;

/**
 *
 * @author 91730
 */
public class HeadOfDepartmentJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HeadOfDepartmentJFrame
     */
    
    Business business;
    UserAccounts userAccounts;
    Department dept;
    
    public HeadOfDepartmentJFrame() {
        initComponents();
    }

    public HeadOfDepartmentJFrame(Business business, UserAccounts userAccounts,Department dept) {
        initComponents();
        this.setVisible(true);
        this.business = business;
        this.userAccounts = userAccounts;
        this.dept = dept;
        hodName.setText(userAccounts.getDeptName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        logOutBtn = new javax.swing.JButton();
        manageCourseCatalog = new javax.swing.JButton();
        manageCourseSchedule = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hodName = new javax.swing.JLabel();
        manageCourseSchedule1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        manageCourseCatalog.setText("Manage Course Catalog");
        manageCourseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCourseCatalogActionPerformed(evt);
            }
        });
        jPanel1.add(manageCourseCatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 30));

        manageCourseSchedule.setText("Manage Course Schedule");
        manageCourseSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCourseScheduleActionPerformed(evt);
            }
        });
        jPanel1.add(manageCourseSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 30));

        jLabel1.setText("Department");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        hodName.setText("HODName");
        jPanel1.add(hodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        manageCourseSchedule1.setText("Manage Course Offer");
        manageCourseSchedule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCourseSchedule1ActionPerformed(evt);
            }
        });
        jPanel1.add(manageCourseSchedule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 170, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageCourseScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCourseScheduleActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ManageCourseScheduleJPanel(this.business,this.userAccounts, this.dept));
    }//GEN-LAST:event_manageCourseScheduleActionPerformed

    private void manageCourseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCourseCatalogActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ManageCourseCatalogJPanel(this.business,this.userAccounts, this.dept));
    }//GEN-LAST:event_manageCourseCatalogActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainJFrame main = new MainJFrame(this.business,this.userAccounts, this.dept);
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void manageCourseSchedule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCourseSchedule1ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ManageCourseOfferJPanel(this.business,this.userAccounts, this.dept));
    }//GEN-LAST:event_manageCourseSchedule1ActionPerformed

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
            java.util.logging.Logger.getLogger(HeadOfDepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeadOfDepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeadOfDepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeadOfDepartmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HeadOfDepartmentJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hodName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton manageCourseCatalog;
    private javax.swing.JButton manageCourseSchedule;
    private javax.swing.JButton manageCourseSchedule1;
    // End of variables declaration//GEN-END:variables
}
