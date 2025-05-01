package dataStructure;

public class ArrayMinMax {
    public int[] findMinMax(int[] array) {
        if (array.length == 0) {
            // Jika array kosong, kembalikan nilai default (misalnya, min =
            // Integer.MAX_VALUE dan max = Integer.MIN_VALUE)
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };
        }

        // Menganggap elemen pertama sebagai nilai min dan max
        int min = array[0];
        int max = array[0];
        // Mengiterasi array untuk mencari nilai minimum dan maksimum
        for (int num : array) {
            if (num < min)
                min = num; // Menemukan nilai terkecil
            if (num > max)
                max = num; // Menemukan nilai terbesar
        }
        // Mengembalikan nilai min dan max dalam array
        return new int[] { min, max };
    }
}
