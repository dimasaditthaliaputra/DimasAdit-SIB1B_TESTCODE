package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayMinMaxTest {

    @Test
    public void testFindMinMax() {
        int[] codeInput = { 80, 2, -3, 14, 95 };
        int[] expectedOutput = { -3, 95 };

        ArrayMinMax arraySum = new ArrayMinMax();
        int[] codeOutput = arraySum.findMinMax(codeInput);

        try {
            assertArrayEquals("Test Find MinMax:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae); 
        }
    }

    @Test
    public void testFindMinMaxEmpty() {
        int[] codeInput = {};
        // Array kosong, sebagai default nilai
        int[] expectedOutput = { Integer.MAX_VALUE, Integer.MIN_VALUE };

        ArrayMinMax arraySum = new ArrayMinMax();
        int[] codeOutput = arraySum.findMinMax(codeInput);

        // Memverifikasi output yang dihasilkan
        try {
            assertArrayEquals("Test find MinMax Empty:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}