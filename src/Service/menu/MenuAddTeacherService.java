/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.menu;

import service.inter.menu.MenuAddStudentsServiceInter;
import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.inter.SaveableProcess;

/**
 *
 * @author ASUS
 */
public class MenuAddTeacherService implements MenuAddStudentsServiceInter ,SaveableProcess{

    @Override

    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        Config.instance().appendTeacher(t);
        System.out.println("teacher added");
    }

}
