/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccounts;

import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class UserAccountDirectory {
    ArrayList<UserAccounts> adminUserAccountDirectory;
    ArrayList<UserAccounts> studentUserAccountDirectory;

    
    public UserAccountDirectory(){
        this.adminUserAccountDirectory = new ArrayList<UserAccounts>();
        this.studentUserAccountDirectory = new ArrayList<UserAccounts>();
    }

    public ArrayList<UserAccounts> getAdminUserAccountDirectory() {
        return adminUserAccountDirectory;
    }

    public void setAdminUserAccountDirectory(ArrayList<UserAccounts> adminUserAccountDirectory) {
        this.adminUserAccountDirectory = adminUserAccountDirectory;
    }

    public ArrayList<UserAccounts> getStudentUserAccountDirectory() {
        return studentUserAccountDirectory;
    }

    public void setStudentUserAccountDirectory(ArrayList<UserAccounts> studentUserAccountDirectory) {
        this.studentUserAccountDirectory = studentUserAccountDirectory;
    }

    
    
    //METHODS
    
    //this method is to create a username, password for System Admin, Faculty, HOD, Employee
    public UserAccounts createUser(String username, String password, String role, String dept){
        UserAccounts user = new UserAccounts(username,password,role,dept);
        this.adminUserAccountDirectory.add(user);
        return user;
    } 
    
    //this method is to create a username, password for student.
    public UserAccounts createStudentUser(String username, String password, String role){
        UserAccounts user = new UserAccounts(username,password,role);
        this.studentUserAccountDirectory.add(user);
        return user;
    } 
    
    public Boolean accountExists(String username, String password, String role){
        System.out.println("7");
        for(UserAccounts u: this.adminUserAccountDirectory){
            System.out.println("8");
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                System.out.println("9");   
                return true;
               }System.out.println("10");
        }
        return false;
    }
    
    public Boolean studentAccountExists(String username, String password, String role){
        for(UserAccounts u: this.studentUserAccountDirectory){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                   return true;
               }
        }
        return false;
    }
    
    public UserAccounts checkUser(String username, String password, String role){
        for(UserAccounts u: this.adminUserAccountDirectory){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
    
    public UserAccounts checkStudentUser(String username, String password, String role){
        for(UserAccounts u: this.studentUserAccountDirectory){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
}
