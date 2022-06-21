package ManagerSwitchActions;

import Menu.ShowMenu;
import UserActions.Manager;

import java.util.Scanner;

public class ManagerSwitchActions extends ShowMenu {

    Scanner scanner = new Scanner(System.in);
    boolean exitMenu = false;

    public void managerProduct(Manager manager){
        System.out.println("ewq");
        showSecondMenu();
        do{
            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1 -> manager.addProduct();
                case 2 -> manager.removeProduct();
                case 3 -> manager.listProduct();
                case 4 -> showSecondMenu();
                default -> exitMenu = true;
            }
            showSecondMenu();
        } while(!exitMenu);
    }


    public void managerUsers(Manager manager) {
        managerMenuUser();
        do{
            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1 -> manager.addUser();
                case 2 -> manager.removeUser();
                case 3 -> manager.listUsers();
                case 4 -> showSecondMenu();
                default -> exitMenu = true;
            }
            managerMenuUser();
        } while(!exitMenu);
    }


}
