/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeProfile;

import Person.Person;

/**
 *
 * @author tanujkodali
 */
public class Employee extends Person{
    String deptName;
    int EmpId;
    String jobName;
    String jobDesc;
    int hourlyPrice;
       
    public Employee(){
        
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public int getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(int hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }
    
    
}
