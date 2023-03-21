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
    
    public Employment createJobs(String empId, String role, String quality, String deptName, String employer, String status){
        Employment emp = new Employment();
        
        emp.setEmploymentId(empId);
        emp.setEmployerName(employer);
        emp.setRole(role);
        emp.setStatus(status);
        emp.setDeptName(deptName);
        //emp.setEmpCourseOfferList(empCourseOfferList);
        emp.setQuality(quality);
        
        this.employmentList.add(emp);
        return emp;
    }
    
    
   
}
