/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentJobQueue;

import Student.Student;
import Student.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class StudentJobDirectory {
    ArrayList<StudentJob> studentJobDirectory;
    StudentDirectory studentList;
    
    public StudentJobDirectory(){
        this.studentJobDirectory = new ArrayList<StudentJob>();
        this.studentList = new StudentDirectory();
    }

    public ArrayList<StudentJob> getStudentJobDirectory() {
        return studentJobDirectory;
    }

    public void setStudentJobDirectory(ArrayList<StudentJob> studentJobDirectory) {
        this.studentJobDirectory = studentJobDirectory;
    }
    
    public StudentJob createStudentJobRequest(StudentJob studentJob, String applicationId, String employerName, String jobStatus, String jobId, String jobRole, String deptName,String appStatus,String studentId,String jobPosition){
        StudentJob sj = studentJob;
        System.out.println("5");
        sj.setApplicationId(applicationId);
        System.out.println("6");
        sj.setEmployerName(employerName);
        System.out.println("7");
        sj.setJobStatus(jobStatus);
        System.out.println("8");
        sj.setJobRole(jobRole);
        System.out.println("9");
        sj.setDeptName(deptName);
        System.out.println("10");
        
        sj.setJobId(jobId);
        System.out.println("11");
        sj.setApplicationStatus(appStatus);
        System.out.println("12");
        sj.setStudentid(studentId);
        System.out.println("13"); 
        sj.setJobPosition(jobPosition);
        this.studentJobDirectory.add(sj);
        return sj;
    }
    
    public void updateJobStatus(String studentId, StudentJob sj){
        for(Student s: this.studentList.getStudentList()){
            if(s.getId().equals(studentId)){
                ArrayList<StudentJob> job = this.studentJobDirectory;
                for(int i=0;i<job.size();i++){
                    if(job.get(i).getApplicationId().equals(sj.getApplicationId())){
                        job.get(i).setApplicationStatus(sj.getApplicationStatus());
                    }
                }
            }
        }
    }
    
    public void updatePromotionStatus(String studentId, StudentJob sj){
        for(Student s: this.studentList.getStudentList()){
            if(s.getId().equals(studentId)){
                ArrayList<StudentJob> job = this.studentJobDirectory;
                for(int i=0;i<job.size();i++){
                    if(job.get(i).getApplicationId().equals(sj.getApplicationId())){
                        job.get(i).setJobPosition(sj.getJobPosition());
                    }
                }
            }
        }
    }
    
    public Boolean checkApplied(String studentId, String jobId, String status){
        for(StudentJob s: this.studentJobDirectory){
            if(s.getStudentid().equals(studentId) && s.getJobId().equals(jobId) && s.getApplicationStatus().equals(status)){
                return true;
            }          
        }
        return false;
    }
}
