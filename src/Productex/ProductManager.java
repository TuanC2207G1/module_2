package Productex;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    LinkedList<Product> listProduct;

    public ProductManager() {
        listProduct = new LinkedList();
    }

    public void addProduct(Scanner scanner) {
        System.out.println("Input id:");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input price:");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Inphut quantity:");
        Integer quantity = scanner.nextInt();
        System.out.println("Input category:");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        int choice = scanner.nextInt();
        Category category = new Category();
        switch (choice) {
            case 1:
                category.setName("Văn học");
                break;
            case 2:
                category.setName("Lịch sử");
                break;
            case 3:
                category.setName("Toán");
                break;
            default:
                System.out.println(" Chọn từ 1 đến 3 thôi!");
        }
        Product product = new Product(id, name, price, quantity, category);
        listProduct.add(product);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productManagers=" + listProduct +
                '}';
    }
}
