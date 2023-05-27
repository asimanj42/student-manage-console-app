/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.menu;

import service.inter.menu.MenuShowStudentsServiceInter;
import bean.Config;
import bean.Student;

/**
 *
 * @author ASUS
 */
public class MenuShowStudentService implements MenuShowStudentsServiceInter{

    @Override
    public void processLogic() {
        Student[] allStudent=Config.instance().getStudents();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]);
        }
    }
    
}
