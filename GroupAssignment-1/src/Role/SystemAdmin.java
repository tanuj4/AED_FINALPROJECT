/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Department.Department;
import UI.SystemAdminPanel.SystemAdminJFrame;
import UserAccounts.UserAccounts;
import javax.swing.JFrame;

/**
 *
 * @author tanujkodali
 */
public class SystemAdmin extends Role{
    
    public SystemAdmin(){
        
    }
    
    @Override
    public JFrame createWorkArea(Department department, UserAccounts userAccounts){
        return new SystemAdminJFrame(department, userAccounts);
    }
}
