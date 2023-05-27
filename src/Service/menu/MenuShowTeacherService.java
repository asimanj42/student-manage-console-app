/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuShowTeacherServiceInter;

/**
 *
 * @author ASUS
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter {

    public void processLogic() {
        Teacher[] allTeacher = Config.instance().getTeachers();
        for (int i = 0; i < allTeacher.length; i++) {
            System.out.println(allTeacher[i]);
        }
    }
}
