package ShopController;

import LoginVerificationUsers.LoginVerification;
import Menu.ShowMenu;
import ProductList.ProductList;
import UserActions.Manager;
import UserActions.Seller;
import UserActions.Storekepper;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        ProductList productList = new ProductList(lista);
        Manager manager = new Manager(productList);
        ShowMenu showMenu = new ShowMenu();
        Storekepper storekepper = new Storekepper(productList);
        Seller seller = new Seller(productList);
        LoginVerification loginVerification = new LoginVerification();

        boolean exitMenu = false;


        do {
            showMenu.showRoleMenu();
            int roleChoose = sc.nextInt();
            switch (roleChoose){
                case 1 -> manager.switchManagerAction();
                case 2 -> storekepper.switchStorekepperAction();
                case 3 -> seller.switchManagerAction();
                case 4 -> {
                    System.out.println("Koniec programu");
                    exitMenu = true;
                }
                default -> System.out.println("upsi");
            }
        } while (!exitMenu);

    }

}
