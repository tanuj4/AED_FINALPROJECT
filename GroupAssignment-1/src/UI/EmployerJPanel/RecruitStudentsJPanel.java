/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.EmployerJPanel;

import Business.Business;
import Department.Department;
import Employment.Employment;
import StudentJobQueue.StudentJob;
import UserAccounts.UserAccountDirectory;
import UserAccounts.UserAccounts;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hi
 */
public class RecruitStudentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecruitStudentsJPanel
     */
    
    Business business;
    UserAccounts userAccounts;
    UserAccountDirectory userAccountDirectory;
    Department dept;
    Employment emp;
    DefaultTableModel jobTableModel;
    

    public RecruitStudentsJPanel() {
        initComponents();
    }
    
    public RecruitStudentsJPanel(Business business, UserAccounts userAccount,Department dept) {
        initComponents();
        
        this.business = business;
        this.userAccounts = userAccount;
        this.dept = dept;
        this.emp = new Employment();
        this.jobTableModel = (DefaultTableModel) jobTable.getModel();
        
        display();
    }

    public void display(){
        ArrayList<StudentJob> jobs = this.business.getStudentJobDirectory().getStudentJobDirectory();
        jobTableModel.setRowCount(0);
        if(jobs.size()>0){
            for(StudentJob s: jobs){
                if(s.getDeptName().equals(userAccounts.getDeptName())){
                    Object row[] = new Object[15];
                    row[0] = s;
                    row[1] = s.getStudentid();
                    row[2] = s.getEmployerName();
                    row[3] = s.getJobStatus();
                    row[4] = s.getJobId();
                    row[5] = s.getJobRole();
                    row[6] = s.getDeptName();
                    row[7] = s.getApplicationStatus();

                    jobTableModel.addRow(row);
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jobTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 233, 152));

        jobTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Application ID", "Student ID", "Employer ", "Job Status", "Job Id", "Job Role", "Department", "Application Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jobTable);

        jLabel1.setText("Recruit Students for Job");

        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(acceptBtn)
                        .addGap(164, 164, 164)
                        .addComponent(rejectBtn)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(rejectBtn))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
        
        /*
        int selectedRow = rentTable.getSelectedRow();
        
        RentalRequest r = (RentalRequest) rentTable.getValueAt(selectedRow, 0);
        if(r.getStatus().equals("Requested")){
            r.setStatus("Accept"); 
            r.getBook().setIsAvailable("no");
        } else {
            JOptionPane.showMessageDialog(null, "No rental request has been raised!!");
        }
                  
        display();
        
        
        int selectedRow = jobTable.getSelectedRow();
        
        StudentJob s = (StudentJob) jobTable.getValueAt(selectedRow, 0);
        
        
        if(s.getApplicationStatus().equals("Applied")){
            s.setApplicationStatus("Accepted");
            //s.getEmployment().setStatus("Closed");
            //this.emp.setStatus("Closed");
        } else {
             JOptionPane.showMessageDialog(null, "No job has been applied to!!");
        }
        
        display();
        */
        
        int selectedRow = jobTable.getSelectedRow();
        if(selectedRow>=0){
            String selectedJobId = jobTable.getValueAt(selectedRow, 4).toString();
            //ArrayList<StudentJob> studentJobList = this.business.getStudentJobDirectory().getStudentJobDirectory();
            ArrayList<Employment> empList = this.business.getJobRequestDirectory().getEmploymentList();
            for(int i=0; i<empList.size();i++){
                String jobId = empList.get(i).getStudentJobs().getJobId();
                
                if(jobId == selectedJobId){
                    Employment emp = empList.get(i);
                    emp.setStatus(false);
                    StudentJob sj = emp.getStudentJobs();
                    sj.setApplicationStatus("Accepted");
                    emp.setStudentJobs(sj);
                    this.business.getStudentJobDirectory().updateJobStatus(this.userAccounts.getEmployerId(), sj);
                }
            }
            JOptionPane.showMessageDialog(null, "Accepted");
        }
        
        
        display();
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        /*
        int selectedRow = jobTable.getSelectedRow();
        
        StudentJob s = (StudentJob) jobTable.getValueAt(selectedRow, 0);
        
        
        if(s.getApplicationStatus().equals("Applied")){
            s.setApplicationStatus("Rejected");
        } else {
             JOptionPane.showMessageDialog(null, "No job has been applied to!!");
        }
        */
        
        int selectedRow = jobTable.getSelectedRow();
        if(selectedRow>=0){
            String selectedJobId = jobTable.getValueAt(selectedRow, 4).toString();
            //ArrayList<StudentJob> studentJobList = this.business.getStudentJobDirectory().getStudentJobDirectory();
            ArrayList<Employment> empList = this.business.getJobRequestDirectory().getEmploymentList();
            for(int i=0; i<empList.size();i++){
                String jobId = empList.get(i).getStudentJobs().getJobId();
                
                if(jobId == selectedJobId){
                    Employment emp = empList.get(i);
                    emp.setStatus(true);
                    StudentJob sj = emp.getStudentJobs();
                    sj.setApplicationStatus("Rejected");
                    emp.setStudentJobs(sj);
                    this.business.getStudentJobDirectory().updateJobStatus(this.userAccounts.getEmployerId(), sj);
                }
            }
            JOptionPane.showMessageDialog(null, "Accepted");
        }
        
        
        display();
    }//GEN-LAST:event_rejectBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jobTable;
    private javax.swing.JButton rejectBtn;
    // End of variables declaration//GEN-END:variables
}
