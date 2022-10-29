package baitapDog;

import java.util.LinkedList;
import java.util.Scanner;

public class DogManager {
    LinkedList<Dog> listDog;


//    public DogManager(LinkedList<Dog> listDog) {
//        this.listDog = listDog;
//    }

    public DogManager() {
        listDog = new LinkedList<Dog>();
    }


    int id = 1;

    public void addDog(Scanner scanner) {
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input weight:");
        double weight = Double.parseDouble(scanner.nextLine());
        Dog dog = new Dog(id, name, age, weight);
        listDog.add(dog);
        id++;
    }

    private int findIndex(Scanner scanner) {
        System.out.println("Input id to edit:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < listDog.size(); i++) {
            if (listDog.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void editDog(Scanner scanner) {
        int index = findIndex(scanner);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Edit name:");
            String name = scanner.nextLine();
            listDog.get(index).setName(name);
            System.out.println("Edit age:");
            int age = Integer.parseInt(scanner.nextLine());
            listDog.get(index).setAge(age);
            System.out.println("Edit weight:");
            double weight = Double.parseDouble(scanner.nextLine());
            listDog.get(index).setWeight(weight);
        }
    }

    public void deleteDog(Scanner scanner) {
        int index = findIndex(scanner);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            listDog.remove(index);
        }
    }

    public void display() {
        for (Dog p : listDog) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "DogManager{" +
                "listDog=" + listDog +
                '}';
    }
}