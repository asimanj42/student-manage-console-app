/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.menu;

import service.inter.menu.MenuRegisterServiceInter;
import service.inter.SaveableProcess;

/**
 *
 * @author ASUS
 */
public class MenuRegisterService implements MenuRegisterServiceInter, SaveableProcess {

    @Override
    public void processLogic() {
        System.out.println("Register");
    }

}
