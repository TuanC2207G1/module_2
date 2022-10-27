package test18102022.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class ProgrammingBook extends Book{
    private String language;
    private String framework;

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    public void addProgrammingBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bookCode:");
        int bookCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập name:");
        String name = scanner.nextLine();
        System.out.print("Nhập price:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập author:");
        String author = scanner.nextLine();
        System.out.println("Nhập Language:");
        String language =scanner.nextLine();
        System.out.println("Nhập framework:");
        String framework =scanner.nextLine();
        ProgrammingBook programmingBook=new ProgrammingBook(bookCode,name,price,author,language,framework);
        books[i]=programmingBook;
        i++;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
