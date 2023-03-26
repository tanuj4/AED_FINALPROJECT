/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacultyProfile;

import Department.Department;
import Employment.Employment;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class FacultyDirectory {
       ArrayList<Faculty> facultyList; 

    public FacultyDirectory() {
         this.facultyList = new ArrayList<Faculty>();
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
    public Faculty createFaculty(String name,String id,String departmentName,Double experience){
     Faculty fac = new Faculty();
        
    fac.setName(name);
    fac.setId(id);
    fac.setDepartmentName(departmentName);
    fac.setExperience(experience);
        
        this.facultyList.add(fac);
        return fac;
    }
     public void deleteFaculty(String id){
        for(Faculty fac : this.facultyList){
            if(fac.getId()==id){
                this.facultyList.remove(fac);
                break;
            }
        }
    
    }
       
}
