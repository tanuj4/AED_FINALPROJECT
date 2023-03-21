/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Department;

import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class College {
    ArrayList<Department> departmentList;

    public College() {
        this.departmentList = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
    
    public Department createDepartment(String deptId, String deptName){
        Department dept = new Department();
        
        dept.setDeptId(deptId);
        dept.setName(deptName);
        
        this.departmentList.add(dept);
        return dept;
    }
    
}

