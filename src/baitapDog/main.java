package baitapDog;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogManager dogManager = new DogManager();
        do {
            System.out.println(dogManager.listDog.toString());
            System.out.println("Enter 1 to add Dog.");
            System.out.println("Enter 2 to edit Dog.");
            System.out.println("Enter 3 to delete Dog.");
            System.out.println("Enter 4 to Display Dog.");
            System.out.println("Enter 0 to exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    dogManager.addDog(scanner);
                    break;
                case 2:
                    dogManager.editDog(scanner);
                    break;
                case 3:
                    dogManager.deleteDog(scanner);
                    break;
                case 4:
                    dogManager.display();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }
}
