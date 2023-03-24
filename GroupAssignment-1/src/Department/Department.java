/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Department;

import CourseCatalog.CourseCatalog;
import EmployeeProfile.EmployeeDirectory;
import FacultyProfile.FacultyDirectory;
import HODProfile.Hoddirectory;
import Student.StudentDirectory;
import UserAccounts.UserAccountDirectory;
import UserAccounts.UserAccounts;

/**
 *
 * @author tanujkodali
 */
public class Department {
    String name;
    String deptId;
    CourseCatalog courseCatalog;
    
    public Department(){
        this.courseCatalog = new CourseCatalog();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }
    
}
