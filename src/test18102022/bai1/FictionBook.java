package test18102022.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class FictionBook extends Book{
    private String category;

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void addFictionBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bookCode:");
        int bookCode = scanner.nextInt();
        System.out.print("Nhập name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Nhập price:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập author:");
        String author = scanner.nextLine();
        System.out.println("Nhập category:");
        String category =scanner.nextLine();
        FictionBook fictionBook=new FictionBook(bookCode,name,price,author,category);
        books[i]=fictionBook;
        i++;

    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
