/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminPanel;

import Business.Business;
import Department.Department;
import FacultyProfile.Faculty;
import HODProfile.Hod;
import UserAccounts.UserAccountDirectory;
import UserAccounts.UserAccounts;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanujkodali
 */
public class ProffesorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProffesorJPanel
     */
    Business business;
    Hod hod;
    UserAccounts userAccounts;
    Department dept;
    UserAccountDirectory userAccountDirectory;
    Faculty fac;
        DefaultTableModel profTableModel1;
    
    public ProffesorJPanel() {
        initComponents();
    }
    
     public ProffesorJPanel(Business business, UserAccounts userAccounts,Department dept) {
         initComponents();
        this.business = business;
        this.userAccounts = userAccounts;
        this.dept = dept;
        this.profTableModel1 = (DefaultTableModel) FacultyTable.getModel();
        displayDepartment();
        displayFaculty();
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
        HodTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldExp = new javax.swing.JTextField();
        fieldUser = new javax.swing.JTextField();
        fieldPass = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        deptComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        FacultyTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        HodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Department Name", "HOD Name", "Hod ID", "HOD Experience"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(HodTable);

        setBackground(new java.awt.Color(188, 183, 98));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("FACULTY");

        jLabel2.setText("Department Name:");

        jLabel4.setText("Professor Name:");

        jLabel5.setText("Experience:");

        jLabel6.setText("UserName:");

        jLabel7.setText("Password:");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        FacultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Department Name", "Professor ID", "Professor Name", " Experience"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(FacultyTable);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createBtn)
                            .addComponent(fieldName)
                            .addComponent(fieldExp)
                            .addComponent(fieldUser)
                            .addComponent(fieldPass)
                            .addComponent(deptComboBox, 0, 143, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(deptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fieldExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(createBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
      public void displayDepartment(){
      deptComboBox.removeAllItems();
        for(Department a: this.business.getDepartmentDirectory().getDepartmentList()){
           deptComboBox.addItem(a.getName());
        }
    }
    
        
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
    
       
        String name= fieldName.getText();
        String exp= fieldExp.getText();
        String username = fieldUser.getText();
        String password = fieldPass.getText();
        String deptName = String.valueOf(deptComboBox.getSelectedItem());
        
        UserAccountDirectory userDir = this.business.getUserAccountDirectory();
        
          if( name.isBlank() ||exp.isBlank()||username.isBlank()||password.isBlank()){
            JOptionPane.showMessageDialog(null,"Please enter details in all fields");
        } else
        if(userDir.accountExists(username, password, "Faculty")){
            JOptionPane.showMessageDialog(null, "Account already exists!!!");
        }else {
               UserAccounts user = this.business.getUserAccountDirectory().createUser(username, password, "Faculty", deptName);
            this.business.getFacultyDirectory().createFaculty(name, user.getFacultyId(), deptName, Double.valueOf(exp));
            JOptionPane.showMessageDialog(null, "Account Created!!!");
        }
          displayFaculty();
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow  =  FacultyTable.getSelectedRow();
        
        if(selectedRow >= 0){
            //delete the object
            this.fac = (Faculty) profTableModel1.getValueAt(selectedRow,0);
            this.business.getFacultyDirectory().deleteFaculty(fac.getId());

        }
       displayFaculty();
    }//GEN-LAST:event_jButton1ActionPerformed
 public void displayFaculty(){
        
       profTableModel1.setRowCount(0);
        for(Faculty fac: this.business.getFacultyDirectory().getFacultyList()){
        //UserAccounts u = this.business.getUserAccountDirectory().findFacultybyId(fac.getId());
            
            
            Object[] row = new Object[10];
           
            //UserAccounts u = this.business.getUserAccountDirectory().findbyId(hod.getId());

            row[0] = fac.getDepartmentName();
            row[1] = fac.getId();
            row[2] = fac.getName();
            row[3] = fac.getExperience();
            //row[4] = u.getUsername();
            //row[5] = u.getPassword();
            
            
            profTableModel1.addRow(row);
            
        }
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FacultyTable;
    private javax.swing.JTable HodTable;
    private javax.swing.JButton createBtn;
    private javax.swing.JComboBox deptComboBox;
    private javax.swing.JTextField fieldExp;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPass;
    private javax.swing.JTextField fieldUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
