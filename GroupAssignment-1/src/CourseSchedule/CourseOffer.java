/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseSchedule;

import CourseCatalog.Course;
import FacultyProfile.Faculty;

/**
 *
 * @author tanujkodali
 */
public class CourseOffer {
    Course course;
    Faculty faculty;
    String courseOfferId;
    
    public CourseOffer(){
        this.course = new Course();
        this.faculty = new Faculty();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getCourseOfferId() {
        return courseOfferId;
    }

    public void setCourseOfferId(String courseOfferId) {
        this.courseOfferId = courseOfferId;
    }
    
    
}
