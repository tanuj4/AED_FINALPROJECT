/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

/**
 *
 * @author tanujkodali
 */
public class Course {
    
    
    private static int count=0;
    String courseId;
    int creditPrice;
    String name;
    int credits;
    
    public Course(){
        
    }

    public Course(String courseId, int creditPrice, String name,int credits) {
        this.courseId = courseId;
        this.creditPrice = creditPrice;
        this.name = name;
        this.credits = credits;
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
            
}