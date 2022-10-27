package minitest12_10;

import java.util.Scanner;

public class ProductManager {
    private Product[] products = new Product[0];
    int leng = 0;

//    public Product[] getProducts() {
//        return products;
//    }
//
//    public void setProducts(Product[] products) {
//        this.products = products;
//    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên:");
        String name = scanner.nextLine();
        System.out.print("Nhập giá:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập mô tả:");
        String description = scanner.nextLine();
        Product addproduct = new Product(name, price, description);
        leng++;
        Product[] products1 = new Product[leng];
        for (int i = 0; i < leng - 1; i++) {
            products1[i] = products[i];
        }
        products1[leng - 1] = addproduct;
        products=products1;

    }
    public void displayProduct(){
        for (Product p: products){
            p.display();
        }
    }
}


