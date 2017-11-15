package java8.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class stream {

    private List<Dish> dishs = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        dishs.add(new Dish(false, "Big plate chicken"));
        dishs.add(new Dish(true, "ma po dou fu"));
        dishs.add(new Dish(false, "Big plate chicken"));
        dishs.add(new Dish(true, "mao xie wang"));

    }

    @Test
    public void shouldGetSpicyFood() throws Exception {
        List<Dish> collect = dishs.stream().filter(Dish::isSpicy).collect(toList());
        assertThat(collect.size(), is(2));
    }

    @Test
    public void shouldGetSpicyFoodName() throws Exception {
        List<String> names = dishs.stream().filter(dish -> dish.isSpicy()).map(dish -> dish.getName()).collect(toList());
        ArrayList<String> expectedNames = new ArrayList<>();
        expectedNames.add("ma po dou fu");
        expectedNames.add("mao xie wang");
        assertThat(names, is(expectedNames));
    }

    @Test
    public void getUniqueElements() throws Exception {
        int[] numbers = {11, 2, 5, 34, 23, 11, 2, 5, 11};
        int[] numbersUnique = Arrays.stream(numbers).distinct().toArray();
        assertThat(numbersUnique, is(new int[]{11, 2, 5, 34, 23}));
    }

    @Test
    public void getCertainIndexRangeElements() throws Exception {
        int[] numbers = {11, 2, 5, 34, 23, 11, 2, 5, 11};
        int[] numbersSlice = Arrays.stream(numbers).limit(3).skip(2).toArray();
        assertThat(numbersSlice, is(new int[]{5}));
    }

    /**
     * Apply a function to each element
     * @throws Exception
     */
    @Test
    public void getLengthOfEachString() throws Exception {
        String[] strings = {"I", "am", "IronMan"};
        Object[] lengths = Arrays.stream(strings).map(String::length).toArray();
        assertThat(lengths, is(new int[]{1, 2, 7}));
    }

    @Test
    public void getDistinctCharacters() throws Exception {
        String whatIWantTosay = "I am iron-man. I don't want to hide my identify any more.";
        Object[] characters = Arrays.stream(whatIWantTosay.split("")).distinct().toArray();
        assertThat(characters, is(new String[]{"I", " ", "a", "m", "i", "r", "o", "n", "-", ".", "d", "'", "t", "w", "h", "e", "y", "f"}));
    }

    @Test
    public void name() throws Exception {
    }

}
