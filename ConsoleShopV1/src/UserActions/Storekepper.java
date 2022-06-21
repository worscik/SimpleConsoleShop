package UserActions;

import Menu.ShowMenu;
import ProductList.ProductList;

import java.util.Scanner;

public class Storekepper extends ShowMenu implements UserActionsOnList{


    ProductList productList;
    Scanner scanner = new Scanner(System.in);
    boolean exitMenu = false;

    public Storekepper(ProductList productList) {
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
        if(!productList.equals(product)) {
            System.out.println("Brak takiego produktu");
        } else {
            System.out.println("Magazynier - usunalem produkt - " + product + '\n');
        }

    }

    @Override
    public void listProduct() {
        System.out.println("Lista produktow");
        productList.showListProducts();
        System.out.println('\n');
    }

    public void switchStorekepperAction(){
        showSecondMenu();
        do{
            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1 -> addProduct();
                case 2 -> removeProduct();
                case 3 -> listProduct();
                case 4 -> showSecondMenu();
                default -> exitMenu = true;
            }
            showSecondMenu();
        } while(!exitMenu);

    }
}
