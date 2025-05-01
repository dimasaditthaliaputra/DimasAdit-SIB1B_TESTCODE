package dataStructure;

public class SequentialSearch {

    // Method untuk melakukan pencarian linear (sequential) dalam array
    public int[] sequentialSearch(int[] array, int target) {
        // Variabel untuk menyimpan index di mana target ditemukan
        // Default-nya -1, artinya belum ketemu
        int index = -1;

        // Variabel untuk menghitung berapa kali perulangan dilakukan
        int iteration = 0;

        // Looping ke seluruh elemen array
        for (int i = 0; i < array.length; i++) {
            iteration += 1; // Setiap kali ngecek 1 elemen, iterasi bertambah

            // Kalau elemen saat ini sama dengan target yang dicari
            if (array[i] == target) {
                index = i;  // Simpan index di mana target ditemukan
                break;      // Keluar dari loop karena udah ketemu
            }
        }

        // Buat array output berisi index (bisa -1 kalau tidak ketemu) dan jumlah iterasi
        int[] output = { index, iteration };

        // Balikin hasil pencarian
        return output;
    }
}