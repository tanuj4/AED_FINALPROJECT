/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employment;

import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class EmploymentDirectory {
    ArrayList<Employment> employmentList;
    
    public EmploymentDirectory(){
        this.employmentList = new ArrayList<Employment>();
    }

    public ArrayList<Employment> getEmploymentList() {
        return employmentList;
    }

    public void setEmploymentList(ArrayList<Employment> employmentList) {
        this.employmentList = employmentList;
    }
    
    public Employment createJobs(String empId, String role, String deptName, String employer, Boolean status, Double jobPrice, String jobDesc, String studentStatus, String position){
        Employment emp = new Employment();
        
        emp.setEmploymentId(empId);
        emp.setEmployerName(employer);
        emp.setRole(role);
        emp.setStatus(status);
        emp.setDeptName(deptName);
        emp.setJobPrice(jobPrice);
        emp.setJobDesc(jobDesc);
        emp.setStudentId(null);
        emp.setStudentStatus(studentStatus);
        emp.setJobPosition(position);
        
        this.employmentList.add(emp);
        return emp;
    }
    
    public Employment findJobByName(String name){
        for(Employment e: this.employmentList){
            if(e.getRole().equals(name)){
                return e;
            }
        }
        return null;
    }
   
}
