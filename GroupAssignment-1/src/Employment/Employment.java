/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employment;

import CourseSchedule.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class Employment {
    String employmentId;
    String role;
    String employerName;
    String quality;
    String deptName;
    String status;
    
    ArrayList<CourseOffer> empCourseOfferList;
    
    
    public Employment(){
        this.empCourseOfferList = new ArrayList<CourseOffer>();
    }

    public String getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<CourseOffer> getEmpCourseOfferList() {
        return empCourseOfferList;
    }

    public void setEmpCourseOfferList(ArrayList<CourseOffer> empCourseOfferList) {
        this.empCourseOfferList = empCourseOfferList;
    }
    
    
}
