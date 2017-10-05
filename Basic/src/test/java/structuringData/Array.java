package structuringData;

import org.junit.Assert;
import org.junit.Test;

/**
 * using arrays for data structuring
 */
public class Array {
    @Test
    public void initializeArray() {
        int[][] Int2D = new int[10][];
        for (int i = 0; i< 10; i++) {
            Int2D[i] = new int[]{1, 2, 3, 4, 5};
        }
        for (int i = 0, len = Int2D.length; i < len; i++) {
            int[] temp = Int2D[i];
            for (int j = 0, l = temp.length; j < l; j++) {
                System.out.print(temp[j] + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void resizingArray() {
        final int INITIAL_SIZE = 10;
        final int GROW_FACTOR = 2;
        int[] array = new int[INITIAL_SIZE];

        int dataNum = 100;
        int nData = 0;
        while (nData++ < dataNum) {
            if (nData > array.length) {
                int[] temp = new int[array.length * GROW_FACTOR];
                System.arraycopy(array, 0, temp, 0, array.length);
                array = temp;
            }
            array[nData++] = nData;
        }
        Assert.assertEquals(160, array.length);
    }
}
