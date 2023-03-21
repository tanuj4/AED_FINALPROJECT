/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Department.Department;
import UserAccounts.UserAccounts;
import javax.swing.JFrame;

/**
 *
 * @author tanujkodali
 */
public abstract class Role {
    public abstract JFrame createWorkArea(Department department, UserAccounts userAccount);
}
