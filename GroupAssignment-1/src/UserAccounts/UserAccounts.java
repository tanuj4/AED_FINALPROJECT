/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccounts;

import Department.Department;
import Role.SystemAdmin;
import javax.swing.JFrame;

/**
 *
 * @author tanujkodali
 */
public class UserAccounts {
    private String username;
    private String password;
    private String role;
    private String accountId;
    private static int count=0;
    private String deptName;
    
    public UserAccounts(){
        this.accountId = "Account" + this.count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public UserAccounts(String username, String password, String role, String deptName){
        this.accountId = role + this.count++;
        this.username = username;
        this.password = password;
        this.role = role;
        this.deptName = deptName;
    }
    
    public UserAccounts(String username, String password, String role){
        this.accountId = role + this.count++;
        this.username = username;
        this.password = password;
        this.role = role;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccounts.count = count;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    
    public JFrame getWorkArea(String role, Department department, UserAccounts userAccounts){
        if(role.equals("System Admin")){
            return new SystemAdmin().createWorkArea(department, userAccounts);
        }
        if(role.equals("Branch Manager")){
            //return new BranchManagerJFrame(business,userAccounts, branch);
        }
        if(role.equals("Customer")){
            //return new CustomerJFrame(business,userAccounts,branch);
        }
        if(role.equals("Librarian")){
            //return new LibrarianJFrame(business,userAccounts,branch);
        }
        return null;
    }
}
