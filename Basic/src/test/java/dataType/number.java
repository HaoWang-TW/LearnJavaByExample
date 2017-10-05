package dataType;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class number {
    @Test
    public void getSizeOfByte() {
        byte maxValueOfByte = Byte.MAX_VALUE;
        byte minValueOfByte = Byte.MIN_VALUE;
        assertEquals(127, maxValueOfByte);
        assertEquals(-128, minValueOfByte);
        assertEquals(8, Byte.SIZE); // 8 bits
        assertEquals(1, Byte.BYTES); // a byte = 8bits
    }

    @Test
    public void parseByte() {
        String byteNum = "127";
        String byteInBinary = "1111";
        assertEquals(127, Byte.parseByte(byteNum));
        assertEquals(15, Byte.parseByte(byteInBinary, 2));
    }

    @Test
    public void getSizeOfShort() {
        short maxValueOfShort = Short.MAX_VALUE;
        short minValueOfShort = Short.MIN_VALUE;
        assertEquals(32767, maxValueOfShort);
        assertEquals(-32768, minValueOfShort);
        assertEquals(16, Short.SIZE);
        assertEquals(2, Short.BYTES);
    }

    @Test
    public void getSizeOfInt() {
        int maxValueOfInt = Integer.MAX_VALUE;
        int minValueOfInt = Integer.MIN_VALUE;
        assertEquals(0x7fffffff, maxValueOfInt); //011111...111
        assertEquals(0x80000000, minValueOfInt); // 1000...000
        assertEquals(4, Integer.BYTES);
        assertEquals(32, Integer.SIZE);
    }

    @Test
    public void getSizeOfLong() {
        long maxValueOfLong = Long.MAX_VALUE;
        long minValueOfLong = Long.MIN_VALUE;
        assertEquals(0x7fffffffffffffffL, maxValueOfLong); //011111...111
        assertEquals(0x8000000000000000L, minValueOfLong); // 1000...000
        assertEquals(8, Long.BYTES);
        assertEquals(64, Long.SIZE);
    }

    @Test
    public void getSizeOfFloat() {
        float maxValueOfFolat = Float.MAX_VALUE;
        float minValueOfFolat = Float.MIN_VALUE;
        System.out.println(maxValueOfFolat);
        System.out.println(minValueOfFolat);
        assertEquals(4, Float.BYTES);
        assertEquals(32, Float.SIZE);
    }

    @Test
    public void getSIzeOfDouble() {
        double maxValueOfDouble = Double.MAX_VALUE;
        double minValueOfDouble = Double.MIN_VALUE;
        System.out.println(maxValueOfDouble);
        System.out.println(minValueOfDouble);
        assertEquals(8, Double.BYTES);
        assertEquals(64, Double.SIZE);
    }

    @Test
    public void getSizeOfChar() {
        assertEquals(2, Character.BYTES);
        assertEquals(16, Character.SIZE);
        assertEquals(0xffff, Character.MAX_VALUE);
        assertEquals(0, Character.MIN_VALUE);
        assertEquals('b', (char) ('a' + 1));
        assertEquals(98, 'a' + 1);
        assertEquals(97, (int) 'a');
    }

    @Test
    public void cast() {
        int a = 0x12345678;
        assertEquals(0x5678,  (short) a);// 0x7ffffffff; => 0xffff:short  =>  -1
        assertEquals(Integer.MIN_VALUE, Integer.MAX_VALUE + 1); // 0x7fff fffff => 0x8000 0000
    }
}
