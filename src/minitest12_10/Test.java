package minitest12_10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager test = new ProductManager();
        do {
            System.out.println("Ấn 1 để thêm sản phẩm vào:");
            System.out.println("Ấn 2 để hiện thị mảng:");
            System.out.println("Nhập 0 để thoát");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    test.addProduct();
                    break;
                case 2:
                    test.displayProduct();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);
    }
}