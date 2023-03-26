/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employment;

import CourseSchedule.CourseOffer;
import Student.Student;
import StudentJobQueue.StudentJob;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class Employment {
    String employmentId;
    String role;
    String employerName;
    String deptName;
    Boolean status;
    String studentStatus;
    Double jobPrice;
    String jobDesc;
    String studentId;
    StudentJob studentJobs;
    String jobPosition;
    
    ArrayList<CourseOffer> empCourseOfferList;
    
    
    public Employment(){
        this.empCourseOfferList = new ArrayList<CourseOffer>();
        this.studentJobs = new StudentJob();
    }

    public String getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public StudentJob getStudentJobs() {
        return studentJobs;
    }

    public void setStudentJobs(StudentJob studentJobs) {
        this.studentJobs = studentJobs;
    }

    

    public String getEmployerName() {
        return employerName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ArrayList<CourseOffer> getEmpCourseOfferList() {
        return empCourseOfferList;
    }

    public void setEmpCourseOfferList(ArrayList<CourseOffer> empCourseOfferList) {
        this.empCourseOfferList = empCourseOfferList;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Double getJobPrice() {
        return jobPrice;
    }

    public void setJobPrice(Double jobPrice) {
        this.jobPrice = jobPrice;
    }
    
    @Override
    
    public String toString(){
        return String.valueOf(this.deptName);
    }
}
