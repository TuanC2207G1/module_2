package bai13.timkiemnhiphandequy;

import java.util.Scanner;

public class CreatArray {

    private int[] array;
     void makeArray(){
        Scanner scanner=new Scanner(System.in);
        int leng = scanner.nextInt();
        int [] array = new int[leng];
        for(int i=0;i<array.length;i++){
            System.out.println("Nhập phần tử index thứ "+i);
            array[i]=scanner.nextInt();
        }
        int temp = array[0];
        for (int i = 0 ; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }
}
