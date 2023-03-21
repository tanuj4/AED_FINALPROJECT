/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HODProfile;

import FacultyProfile.Faculty;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class Hoddirectory {
       ArrayList<Hod> HodList; 
       
       
       public Hoddirectory() {
         this.HodList = new ArrayList<Hod>();
    }

    public ArrayList<Hod> getHodList() {
        return HodList;
    }

    public void setHodList(ArrayList<Hod> HodList) {
        this.HodList = HodList;
    }
    
    
     public Hod createHod(String name,String id,String departmentName,Double experience){
        Hod hod = new Hod();

        hod.setName(name);
        hod.setId(departmentName);
        hod.setDepartmentName(departmentName);
        hod.setExperience(experience);

        this.HodList.add(hod);
        return hod;
    }

}

