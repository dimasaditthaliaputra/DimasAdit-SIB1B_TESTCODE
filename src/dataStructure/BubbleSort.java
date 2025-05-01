package dataStructure;

public class BubbleSort {
    // Method bubblesort dengan control jumlah iterasi
    public int[] bubbleSort(int[] array, int maxIterasi) {
        // Memeriksa apakah array kosong, hanya memiliki satu elemen atau maxIterasi adalah negatif
        if (array == null || array.length < 2 || maxIterasi < 0) {
            return array;
        }

        // Melakukan pengurutan menggunakan algoritma Bubble Sort
        // Membatasi jumlah iterasi sesuai dengan maxIterasi atau jika maxIterasi lebih besar dari panjang array
        // Maka akan melakukan looping sebanyak panjang array
        for (int i = 0; i < Math.min(maxIterasi, array.length - 1); i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Jika elemen saat ini lebih besar dari elemen berikutnya, tukar posisinya
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
