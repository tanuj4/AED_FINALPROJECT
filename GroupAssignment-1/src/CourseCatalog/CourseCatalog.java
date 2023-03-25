/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class CourseCatalog {
//    Department department;
//    String lastupdated;
    ArrayList<Course> courselist; 
    
    
    public CourseCatalog(){
        courselist = new ArrayList();
    }
    
//    public CourseCatalog(Department d){
//        courselist = new ArrayList();
//        department = d;
//    }

//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }

//    public String getLastupdated() {
//        return lastupdated;
//    }
//
//    public void setLastupdated(String lastupdated) {
//        this.lastupdated = lastupdated;
//    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }

    public void setCourselist(ArrayList<Course> courselist) {
        this.courselist = courselist;
    }
    
    public Course createCourse(String name, int credits, int creditPrice, String department){
        Course course = new Course();
        
        course.setCreditPrice(creditPrice);
        course.setName(name);
        course.setCredits(credits);
        course.setDepartment(department);
//        course.getSem().setSemName(semname);
        
        this.courselist.add(course);
        return course;
    }
    
    public Course findCourseByName(String name){
        for(Course c: this.courselist){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    
    public void deleteCourse(String id){
        for(Course c: this.courselist){
            if(c.getCourseId()==id){
                this.courselist.remove(c);
                break;
            }
        }
    }
        
}
