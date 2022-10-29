package Productex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Category category1=new Category("Văn học");
        Category category2=new Category("Văn học");
        Category category3=new Category("Văn học");
        ProductManager productManager=new ProductManager();
        Scanner scanner=new Scanner(System.in);
        productManager.addProduct(scanner);
        System.out.println(productManager.toString());
    }
}
