/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacultyProfile;

import Person.Person;
import UserAccounts.UserAccountDirectory;
import UserAccounts.UserAccounts;

/**
 *
 * @author tanujkodali
 */
public class Faculty extends Person {
    String departmentName;
    Double experience;
    UserAccounts userAccounts;
    UserAccountDirectory userAccountDirectory;

    public Faculty() {
        this.departmentName = departmentName;
        this.experience = experience;
        this.userAccountDirectory = new UserAccountDirectory();
        this.userAccounts = new UserAccounts();
    }

    public UserAccounts getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(UserAccounts userAccounts) {
        this.userAccounts = userAccounts;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }
    
    
    
}
