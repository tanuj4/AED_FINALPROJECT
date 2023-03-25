/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Business;
import UI.HeadOfDepartment.HeadOfDepartmentJFrame;
import UI.SystemAdminPanel.SystemAdminJFrame;
import UserAccounts.UserAccounts;
import javax.swing.JFrame;

/**
 *
 * @author 91730
 */
public class HOD {
    
    public JFrame createWorkArea(Business business, UserAccounts userAccounts){
        return new HeadOfDepartmentJFrame(business, userAccounts);
    }
}
