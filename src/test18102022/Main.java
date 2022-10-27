package test18102022;

import java.util.Scanner;

import test18102022.bai1.Book;
import test18102022.bai1.FictionBook;
import test18102022.bai1.ProgrammingBook;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook programmingBook = new ProgrammingBook();
        FictionBook fictionBook = new FictionBook();
        do {
            System.out.println("Ấn 1 để thềm ProgrammingBook:");
            System.out.println("Ấn 2 để thêm FictionBook:");
            System.out.println("Ấn 0 để thoát");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    programmingBook.addProgrammingBook();
                    break;
                case 2:
                    fictionBook.addFictionBook();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true) ;
    }
}
