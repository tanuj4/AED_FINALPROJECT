/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import CourseSchedule.Semester;
import FacultyProfile.Faculty;

/**
 *
 * @author tanujkodali
 */
public class Course {
    
    String courseId;
    int creditPrice;
    String name;
    int credits;
    private static int count=0;
    String department;
    Semester sem;
    Faculty faculty;
    Feedback feedback;
    
    public Course(){
        this.courseId = "Course-" + ++this.count;
        this.sem = new Semester();
        this.faculty = new Faculty();
        this.feedback = new Feedback();
    }

    public Course(int creditPrice, String name,int credits, String department) {
        this.courseId = "Course-" + ++this.count;
        this.creditPrice = creditPrice;
        this.name = name;
        this.credits = credits;
        this.department = department;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
    
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    

    public Semester getSem() {
        return sem;
    }

    public void setSem(Semester sem) {
        this.sem = sem;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Course.count = count;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCreditPrice() {
        return creditPrice;
    }

    public void setCreditPrice(int creditPrice) {
        this.creditPrice = creditPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    //METHODS
    public int getCoursePrice() {
        return creditPrice * credits;

    }
    
    
    @Override
    public String toString(){
        return this.courseId;
    }
          
}
