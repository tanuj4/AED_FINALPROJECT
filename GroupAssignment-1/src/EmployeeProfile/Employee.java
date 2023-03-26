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
    String EmpId;
    String Age;
    String jobName;
    String jobDesc;
    int hourlyPrice;
    Double experience;
       
    public Employee(){
        
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
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

     
    @Override
    public String toString(){
        return this.EmpId;
    }
     
}
