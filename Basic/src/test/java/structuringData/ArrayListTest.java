package structuringData;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void testArrayList() {
        ArrayList<MyType> array = new ArrayList<>();
        array.add(new MyType("wanghao"));
        array.add(1, new MyType(""));
    }
}
class MyType{
    private String name;

    public MyType(String name) {
        this.name = name;
    }
}
