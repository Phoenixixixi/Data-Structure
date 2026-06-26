import java.util.Arrays;


class ArrayDelete{
    public static void running(){
        int[] angka = {10, 20, 30, 40, 50}; // length : 5
        int pos = 2;
        int[] hasil = new int[angka.length - 1]; // lengt : 4

        for(int i = 0; i < pos; i++){
            hasil[i] = angka[i];
        }
        // 10 20 
        for(int i = pos; i < angka.length - 1; i++){
            hasil[i] = angka[i + 1];
        }
        // 40 50
        System.out.println("Array hasil delete : " + Arrays.toString(hasil));
    }
}

class ArrayInsert{
    public static void run(){
        int[] angka = {10, 20, 40, 50, 60, 70}; //6
        int[] hasil = new int[angka.length + 1]; // 7

        int target = 2;
        int insert = 30;

        for(int i = 0; i < target; i++ ){
            hasil[i] = angka[i];
        }

        hasil[target] = insert;

        for(int i = target; i < angka.length; i++){
            hasil[i + 1] = angka[i];
        }

        System.out.println("Array hasil insert : " + Arrays.toString(hasil));

        

    }
}


public class Main {
    public static void main(String[] args){

        ArrayDelete.running();
        ArrayInsert.run();
    }
}
