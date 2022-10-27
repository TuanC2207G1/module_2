package introductiontojava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width, length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều dài:");
        length = scanner.nextFloat();
        float area = width * length;
        System.out.println(area);
    }
}
