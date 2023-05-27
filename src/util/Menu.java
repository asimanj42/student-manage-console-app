package util;

import Service.menu.MenuAddStudentService;
import Service.menu.MenuAddTeacherService;
import Service.menu.MenuLoginService;
import Service.menu.MenuRegisterService;
import Service.menu.MenuShowStudentService;
import Service.menu.MenuShowTeacherService;
import bean.Config;
import service.inter.Process;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all students", new MenuShowStudentService()),
    UNKNOWN;

    private String label;
    private Process service;

    private int number;

    Menu() {

    }

    Menu(int number, String label, Process service) {

        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {

        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {

        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {

        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }

        }
        return Menu.UNKNOWN;

    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }

                } else if (Config.isLoggedIn()) {

                    System.out.println(menus[i]);
                }
            }

        }
    }

}
