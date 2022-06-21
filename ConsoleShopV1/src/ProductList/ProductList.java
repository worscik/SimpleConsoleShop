package ProductList;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private List<String> listProducts = new ArrayList<>();

    public ProductList(List<String> listProducts) {
        this.listProducts = listProducts;
    }

    public List<String> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<String> listProducts) {
        this.listProducts = listProducts;
    }

    public void addProduct(String product) {
        listProducts.add(product);
    }

    public void removeProduct(String product) {
        listProducts.remove(product);
    }

    public void showListProducts() {
        for (String list : listProducts) {
            System.out.println("- " + list);
        }
    }

}
