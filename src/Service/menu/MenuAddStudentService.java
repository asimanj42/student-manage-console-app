/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.menu;

import service.inter.menu.MenuAddStudentsServiceInter;
import bean.Config;
import bean.Student;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuAddStudentService implements MenuAddStudentsServiceInter {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        Config.instance().appendStudent(s);
        System.out.println("students added");
        
    }

    

}
