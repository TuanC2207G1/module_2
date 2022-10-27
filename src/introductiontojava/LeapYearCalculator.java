package introductiontojava;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println(" Nhập năm bạn muốn kiểm tra:");
        int check;
        check = scanner.nextInt();
        while (check != 0) {
            year = check;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.printf("%d is a leap year", year);
                    } else {
                        System.out.printf("%d is NOT a leap year", year);
                    }
                } else {
                    System.out.printf("%d is a leap year", year);
                }
            } else {
                System.out.printf("%d is NOT a leap year", year);
            }
            System.out.println(" Nhập 0 để thoát hoặc nhập năm khác để kiểm tra ");
            check =scanner.nextInt();
        }
    }
}
