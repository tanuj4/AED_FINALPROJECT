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
    private static int count=1;
    
    public Department(){
        //this.deptId = "Department-" + this.count++;
        this.courseCatalog = new CourseCatalog();
    } 
    
    public Department(String deptName){
        this.deptId = deptName + this.count++;
        this.courseCatalog = new CourseCatalog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Department.count = count;
    }
    
    
/*
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Department.count = count;
    }
    */
    
     
    @Override
    public String toString(){
        return this.deptId;
    }
     
}
