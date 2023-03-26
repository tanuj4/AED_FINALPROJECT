/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccounts;

import Business.Business;
import Department.Department;
import Role.SystemAdmin;
import UI.EmployerJPanel.EmployerJFrame;
import UI.Faculty.FacultyJFrame;
import UI.HeadOfDepartment.HeadOfDepartmentJFrame;
import UI.Student.StudentJFrame;
import java.lang.invoke.MethodHandles;
import javax.swing.JFrame;

/**
 *
 * @author tanujkodali
 */
public class UserAccounts {
    private String username;
    private String password;
    private String role;
//    private String accountId;
    private String hodId;
    private String studentId;
    private String employerId;
    private String facultyId;
    private String deptId;
    private static int deptCount=1;
    private static int hodCount=1;
    private static int studentCount=1;
    private static int employerCount=1;
    private static int facultyCount=1;
    private String deptName;
    
    public UserAccounts(){
//        this.accountId = "Account" + getNextCount(this.role);
//        this.username = username;
//        this.password = password;
//        this.role = role;
//        this.deptName = deptName;
    }
    
    public UserAccounts(String username, String password, String role, String deptName){
        /*if(role=="Department"){
            this.deptId = role + this.deptCount++;
        } else*/ if(role=="Department HOD"){
            this.hodId = role + this.hodCount++;
        }else if(role=="Student"){
            this.studentId = role + this.studentCount++;
        }else if(role=="Employer"){
            this.employerId = role + this.employerCount++;
        }else if (role=="Faculty"){
            this.facultyId = role + this.facultyCount++;
        }
//        this.accountId = "Account" + getNextCount(this.role);
        this.username = username;
        this.password = password;
        this.role = role;
        this.deptName = deptName;
    }
    
    public UserAccounts(String username, String password, String role){
//        this.accountId = "Account" + getNextCount(this.role);
        /*if(role=="Department"){
            this.deptId = role + this.deptCount++;
        } else */
        if(role=="Department HOD"){
            this.hodId = role + this.hodCount++;
        }else if(role=="Student"){
            this.studentId = role + this.studentCount++;
        }else if(role=="Employer"){
            this.employerId = role + this.employerCount++;
        }else if (role=="Faculty"){
            this.facultyId = role + this.facultyCount++;
        }
        this.username = username;
        this.password = password;
        this.role = role;
        
    }

    public static int getDeptCount() {
        return deptCount;
    }

    public static void setDeptCount(int deptCount) {
        UserAccounts.deptCount = deptCount;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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

    public String getHodId() {
        return hodId;
    }

    public void setHodId(String hodId) {
        this.hodId = hodId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmployerId() {
        return employerId;
    }

    public void setEmployerId(String employerId) {
        this.employerId = employerId;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public static int getHodCount() {
        return hodCount;
    }

    public static void setHodCount(int hodCount) {
        UserAccounts.hodCount = hodCount;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        UserAccounts.studentCount = studentCount;
    }

    public static int getEmployerCount() {
        return employerCount;
    }

    public static void setEmployerCount(int employerCount) {
        UserAccounts.employerCount = employerCount;
    }

    public static int getFacultyCount() {
        return facultyCount;
    }

    public static void setFacultyCount(int facultyCount) {
        UserAccounts.facultyCount = facultyCount;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    
    public JFrame getWorkArea(String role, Business business, UserAccounts userAccounts, Department dept){
        if(role.equals("System Admin")){
            return new SystemAdmin().createWorkArea(business, userAccounts,dept);
        }
        if(role.equals("Department HOD")){
            return new HeadOfDepartmentJFrame(business, userAccounts,dept);
        }
        if(role.equals("Faculty")){
            return new FacultyJFrame(business, userAccounts,dept);
        }
        if(role.equals("Employer")){
            return new EmployerJFrame(business, userAccounts,dept);
        }
        if(role.equals("Student")){
            return new StudentJFrame(business, userAccounts,dept);
        }
        
        return null;
    }
}
