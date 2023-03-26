/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentJobQueue;

import Employment.Employment;

/**
 *
 * @author hi
 */
public class StudentJob {
    String applicationId;
    String studentid;
    String jobRole;
    String jobStatus;
    String employerName;
    String deptName;
    String jobId;
    String applicationStatus;
    String jobPosition;
    private static int count=0;
    
     
    public StudentJob(){
        this.applicationId = "Application" + this.count++;
        this.applicationStatus = "Not applied";
        
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
    
    

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        StudentJob.count = count;
    }

    public String getEmployerName() {
        return employerName;
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

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getJobId() {
        return jobId;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

     @Override
    public String toString() {
       return this.applicationId;
    }
}
