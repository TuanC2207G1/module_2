package bai13.timkiemnhiphandequy;

public class BinarySearch {
    int binarasearch(int[] array, int left,int right ,int value) {
        while (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                return binarasearch(array,middle+1,right,value);
            }
            if(value<array[middle]){
                return  binarasearch(array,left,middle-1,value);
            }
        }
        return -1;

    }
}
