package bai13.timkiemnhiphandequy;

public class main {
    public static void main(String[] args) {
        CreatArray creatArray = new CreatArray();
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Nhập độ dài của mảng:");
        creatArray.makeArray();
        for (int i : creatArray.getArray()) {
            System.out.print(i + "  ");
        }
        System.out.println();
        int result = binarySearch.binarasearch(creatArray.getArray(),0,6, 4);
        if(result==-1){
            System.out.println("Không tìm thấy value này");
        }else{
            System.out.println("Vị trí index của value này ở :" + result);
        };

    }
}
