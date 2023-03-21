/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseSchedule;

import CourseCatalog.Course;
import FacultyProfile.Faculty;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class CourseSchedule {
    ArrayList<CourseOffer> courseOfferList;
    
    public CourseSchedule(){
        this.courseOfferList = new ArrayList<CourseOffer>();
    }

    public ArrayList<CourseOffer> getCourseOfferList() {
        return courseOfferList;
    }

    public void setCourseOfferList(ArrayList<CourseOffer> courseOfferList) {
        this.courseOfferList = courseOfferList;
    }
    
    public CourseOffer addCourseOffer(Course course, Faculty faculty, String id){
        CourseOffer co = new CourseOffer();
        
        co.setCourse(course);
        co.setFaculty(faculty);
        co.setCourseOfferId(id);
        
        this.courseOfferList.add(co);
        return co;
    }
    
    public CourseOffer findCourseOfferById(String id) {
        for(CourseOffer c: this.courseOfferList) {
            if(c.getCourseOfferId().equals(id)) {
                return c;
            }
        }
        return null;
    }
    
    //public CourseOffer assignFaculty()
}
