/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HODProfile;

import Person.Person;

/**
 *
 * @author tanujkodali
 */
public class Hod extends Person {
    String departmentName;
    Double experience;
    String id;
    
     public  Hod(){
          super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  
    

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }
     
     @Override
    public String toString(){
        return this.departmentName;
    }
}
