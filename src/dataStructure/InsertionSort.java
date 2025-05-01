package dataStructure;

public class InsertionSort {

    // Method insertionSort untuk mengurutkan array dengan kontrol jumlah iterasi
    public int[] insertionSort(int[] array, int maxIterasi) {
        // Memeriksa apakah array null, memiliki kurang dari dua elemen, atau maxIterasi negatif
        if (array == null || array.length < 2 || maxIterasi < 0) {
            return array;  // Jika kondisi di atas terpenuhi, langsung return array tanpa sorting
        }

        // Iterasi dilakukan dari indeks 1 sampai maxIterasi atau panjang array
        // Iterasi ini mengurutkan elemen satu per satu dengan cara menyisipkan elemen pada posisi yang tepat
        for (int i = 1; i < Math.min(maxIterasi, array.length); i++) {
            int temp = array[i];  // Elemen yang akan diposisikan pada urutan yang benar
            int j = i - 1;  // Indeks untuk membandingkan elemen sebelumnya

            // Pindahkan elemen-elemen yang lebih besar dari temp ke posisi selanjutnya
            // Elemen yang lebih besar dari temp akan digeser ke kanan untuk memberi ruang bagi temp
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];  // Geser elemen ke kanan
                j = j - 1;  // Pindah ke elemen sebelumnya
            }

            // Tempatkan temp pada posisi yang sesuai (elemen yang lebih kecil dari temp sudah digeser ke kanan)
            array[j + 1] = temp;
        }

        // Retrun array yang sudah diurutkan setelah iterasi
        return array;
    }
}