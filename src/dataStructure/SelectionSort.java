package dataStructure;

public class SelectionSort {
    // Method selectionSort untuk mengurutkan array dengan kontrol jumlah iterasi
    public int[] selectionSort(int[] array, int maxIterasi) {
        // Memeriksa apakah array null, memiliki kurang dari dua elemen, atau maxIterasi negatif
        if (array == null || array.length < 2 || maxIterasi < 0) {
            return array;  // Jika kondisi di atas terpenuhi, langsung return array tanpa sorting
        }
        
        // Melakukan iterasi sebanyak maxIterasi atau panjang array - 1, mana yang lebih kecil
        for (int i = 0; i < Math.min(maxIterasi, array.length - 1); i++) {
            int minIndex = i;  // Menyimpan indeks elemen terkecil yang ditemukan sebagai pembanding nilai terkecil awal
            
            // Mencari elemen terkecil dalam sisa array yang belum terurut
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {  // Jika ditemukan elemen yang lebih kecil
                    minIndex = j;  // Simpan indeks elemen terkecil
                }
            }

            // Tukar elemen pada posisi i dengan elemen terkecil yang ditemukan pada posisi minIndex
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        // Return array yang sudah diurutkan
        return array;
    }
}