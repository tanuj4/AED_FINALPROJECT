/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeProfile;

import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class EmployeeDirectory {
    ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
        this.employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee createEmployee(String name, String id, Double exp, String deptname){
        Employee emp = new Employee();
        
        emp.setName(name);
        emp.setEmpId(id);
        emp.setDeptName(deptname);
        emp.setExperience(exp);
        
        this.employeeList.add(emp);
        return emp;
    }
}
