package bai13.binarysearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearch search=new BinarySearch();
        int []list={2,4,5,7,10,11,14,15,17,21,22,6,29,31,45,67,79};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input Key to search:");
        int key= scanner.nextInt();
        if (search.binarySearch(list,key)==-1){
            System.out.println("Not found");
        }else {
            System.out.println("Index Key = "+ search.binarySearch(list,key)+"  Value ="+key);
        }
    }
}
