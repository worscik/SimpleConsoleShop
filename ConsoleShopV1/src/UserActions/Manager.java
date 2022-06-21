package UserActions;

import ManagerSwitchActions.ManagerSwitchActions;
import Menu.ShowMenu;
import ProductList.ProductList;
import SystemUsers.SystemUsers;

import java.util.Locale;
import java.util.Scanner;

public class Manager extends ManagerSwitchActions implements UserActionsOnList {

    ProductList productList;
    SystemUsers systemUsers;
    Scanner scanner = new Scanner(System.in);

    public Manager(ProductList productList) {
        this.productList = productList;
    }

    @Override
    public void addProduct() {
        System.out.println("Podaj produkt");
        String product = scanner.nextLine();
        productList.addProduct(product);
        System.out.println("Magager - dodalem produkt - " + product + '\n');
    }

    @Override
    public void removeProduct() {
        System.out.println("Usuń produkt:");
        String product = scanner.nextLine();
        productList.removeProduct(product);
        if (!productList.equals(product)) {
            System.out.println("Brak takiego produktu");
        } else {
            System.out.println("Manager - usunalem produkt - " + product + '\n');
        }
    }

    @Override
    public void listProduct() {
        System.out.println("Lista produktow");
        productList.showListProducts();
        System.out.println('\n');
    }

    public void addUser(){
        System.out.println("Podaj uzytkownika do dodania");
        String user = scanner.nextLine();
        systemUsers.addUser(user);
        System.out.println("Magager - dodalem uzytkownika - " + user + '\n');
    }

    public void removeUser() {
        System.out.println("Podaj uzytkownika do usuniecia");
        String user = scanner.nextLine();
        systemUsers.removeUser(user);
        System.out.println("Magager - usunalem uzytkownika - " + user + '\n');
    }

    public void listUsers() {
        System.out.println("Lista użytkowników");
        systemUsers.listUsers();
        System.out.println('\n');
    }



    public void switchManagerAction(){
        System.out.println("Podaj czy chcesz operacji na produkcie czy userach");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1 -> {
                managerProduct(this);
            }
            case 2 -> {
                managerUsers(this);
            }
            default -> System.out.println("ewq");
        }
    }

}
