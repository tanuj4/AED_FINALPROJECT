/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import CourseCatalog.Course;
import Department.Department;
import Employment.Employment;
import Person.Person;
import StudentJobQueue.StudentJob;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class Student extends Person{
    String deptName;
    
    String applicationStatus;
    Employment studentEmployment;
	ArrayList<Course> courseSeat;
    ArrayList<StudentJob> studentJobList;
    
    public Student(){
        super();
        this.studentEmployment = new Employment();
        this.studentJobList = new ArrayList<StudentJob>();
		this.courseSeat = new ArrayList<>();
    }

    public ArrayList<Course> getCourseSeat() {
        return courseSeat;
    }

    public void setCourseSeat(ArrayList<Course> courseSeat) {
        this.courseSeat = courseSeat;
    }

    
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Employment getStudentEmployment() {
        return studentEmployment;
    }

    public void setStudentEmployment(Employment studentEmployment) {
        this.studentEmployment = studentEmployment;
    }

    public ArrayList<StudentJob> getStudentJobList() {
        return studentJobList;
    }

    public void setStudentJobList(ArrayList<StudentJob> studentJobList) {
        this.studentJobList = studentJobList;
    }
	
	public void registerCourse(Course c){
        
        for(int i =0;i< courseSeat.size();i++ ){
            if(c==courseSeat.get(i)){
                return;
            }
        }
        
        if(courseSeat.size()==0)
        {
            this.courseSeat.add(c); 
        }
        else{
            if((courseSeat.get(0).getSem().getSemName()).equals(c.getSem().getSemName())){
                this.courseSeat.add(c);
            }
            else{
                System.out.println("Not allowed to take courses from multiple semesters"); 
            }
        }

//        if(i==0){
//            this.courseSeat.add(c);
//            sem = c.getSem().getSemName();
//            System.out.println(sem);
//        }
//        else{
//            System.out.println(sem);
//            System.out.println(i);
//            if(c.getSem().getSemName().equals(sem)){
//                this.courseSeat.add(c);
//            }
//            else{
//                System.out.println("Not allowed to take courses from multiple semesters");
//            }
//        } 
    }
    
    public void dropCourse(Course c){
        this.courseSeat.remove(c);
    }
    
    @Override
    public String toString(){
        return this.deptName;
    }
}



