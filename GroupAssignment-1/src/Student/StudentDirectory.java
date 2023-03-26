/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class StudentDirectory {
    ArrayList<Student> studentList;
    
    public StudentDirectory(){
        this.studentList = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    //METHODS
    
    public Student createStudent(String id, String name, String deptName){
        Student student = new Student();
        
        student.setId(id);
        student.setName(name);
        student.setDeptName(deptName);
        
        student.setApplicationStatus(null);
        student.setStudentEmployment(null);
        
        this.studentList.add(student);
        return student;
    }
    
    public Student findById(String id){
        for(Student s: this.studentList){
            if(s.getId().equalsIgnoreCase(id)){
                return s;
            }
        }
        return null;
    }
     public void deleteStudent(String id){
        for(Student stud : this.studentList){
            if(stud.getId()==id){
                this.studentList.remove(stud);
                break;
            }
        }
    
    }
}
