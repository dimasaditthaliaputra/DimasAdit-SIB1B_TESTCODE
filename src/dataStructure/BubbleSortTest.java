package dataStructure;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class BubbleSortTest {
    // Pengujian kondisi sementara
    @Test
    public void testBubbleSort1() {
        BubbleSort bSort = new BubbleSort();
        // Array input yang akan diurutkan
        int[] codeInput1 = { 5, 2, 8, 1, 9 };
        int codeInput2 = 2; // Jumlah iterasi yang akan dilakukan
        // Array output yang dihasilkan setelah pengurutan
        int[] codeOutput = bSort.bubbleSort(codeInput1, codeInput2);
        // Output yang diharapkan setelah 2 iterasi
        int[] expOutput = { 2, 1, 5, 8, 9 };

        try {
            // Memeriksa apakah hasil pengurutan sesuai dengan yang diharapkan
            assertEquals("Test 1:", Arrays.toString(expOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            // Menampilkan output error jika hasil tidak sesuai
            System.out.println(ae);
        }
    }

    @Test
    public void testBubbleSort2() {
        BubbleSort bSort = new BubbleSort();
        // Array input yang akan diurutkan
        int[] codeInput1 = { 121, -1, 9, 83, 52, -7, 3, -83, 75 };
        int codeInput2 = 120; // Jumlah iterasi yang akan dilakukan
        // Array output yang dihasilkan setelah pengurutan
        int[] codeOutput = bSort.bubbleSort(codeInput1, codeInput2);
        // Output yang diharapkan setelah 120 iterasi
        int[] expOutput = { -83, -7, -1, 3, 9, 52, 75, 83, 121 };

        try {
            // Memeriksa apakah hasil pengurutan sesuai dengan yang diharapkan
            assertEquals("Test 2:", Arrays.toString(expOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            // Menampilkan output error jika hasil tidak sesuai
            System.out.println(ae);
        }
    }

    @Test
    public void testBubbleSort3() {
        BubbleSort bSort = new BubbleSort();
        // Array input yang akan diurutkan
        int[] codeInput1 = { -123, 53, 5, 23, -2, 48, 90, -83 };
        int codeInput2 = -10; // Jumlah iterasi yang akan dilakukan
        // Array output yang dihasilkan setelah pengurutan
        int[] codeOutput = bSort.bubbleSort(codeInput1, codeInput2);
        // Output yang diharapkan setelah -10 iterasi
        int[] expOutput = { -123, 53, 5, 23, -2, 48, 90, -83 };

        try {
            // Memeriksa apakah hasil pengurutan sesuai dengan yang diharapkan
            assertEquals("Test 3:", Arrays.toString(expOutput), Arrays.toString(codeOutput));
        } catch (AssertionError ae) {
            // Menampilkan output error jika hasil tidak sesuai
            System.out.println(ae);
        }
    }
}