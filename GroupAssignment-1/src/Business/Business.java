/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CourseCatalog.CourseCatalog;
import Department.College;
import Department.Department;
import EmployeeProfile.EmployeeDirectory;
import FacultyProfile.FacultyDirectory;
import HODProfile.Hoddirectory;
import Student.StudentDirectory;
import UserAccounts.UserAccountDirectory;
import UserAccounts.UserAccounts;
import Employment.EmploymentDirectory;

/**
 *
 * @author tanujkodali
 */
public class Business {
    UserAccounts userAccounts;
    UserAccountDirectory userAccountDirectory;
    Hoddirectory hodDirectory;
    FacultyDirectory facultyDirectory;
    StudentDirectory studentDirectory;
    EmployeeDirectory employeeDirectory;
    College departmentDirectory;
    CourseCatalog courseCatalogDirectory;
    EmploymentDirectory jobRequestDirectory;
    
    public Business(){
        this.userAccountDirectory = new UserAccountDirectory();
        this.userAccounts = new UserAccounts();
        this.hodDirectory = new Hoddirectory();
        this.facultyDirectory = new FacultyDirectory();
        this.studentDirectory = new StudentDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.departmentDirectory = new College();
        this.courseCatalogDirectory = new CourseCatalog();
        this.jobRequestDirectory = new EmploymentDirectory();
        
        this.userAccountDirectory.createUser("admin", "admin", "System Admin",null);
    }

    public EmploymentDirectory getJobRequestDirectory() {
        return jobRequestDirectory;
    }

    public void setJobRequestDirectory(EmploymentDirectory jobRequestDirectory) {
        this.jobRequestDirectory = jobRequestDirectory;
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

    public Hoddirectory getHodDirectory() {
        return hodDirectory;
    }

    public void setHodDirectory(Hoddirectory hodDirectory) {
        this.hodDirectory = hodDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public College getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(College departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }

    public CourseCatalog getCourseCatalogDirectory() {
        return courseCatalogDirectory;
    }

    public void setCourseCatalogDirectory(CourseCatalog courseCatalogDirectory) {
        this.courseCatalogDirectory = courseCatalogDirectory;
    }
   
    public static Business getInstance(){
        return new Business();
    }
}
