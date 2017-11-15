package java8.stream;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FindAndMatch {
    private List<Dish> dishs = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        dishs.add(new Dish(false, "Big plate chicken"));
        dishs.add(new Dish(true, "ma po dou fu"));
        dishs.add(new Dish(false, "Big plate chicken"));
        dishs.add(new Dish(true, "mao xie wang"));

    }

    @Test
    public void haveSpicyFood() throws Exception {
        boolean hasSpicyFood = dishs.stream().anyMatch(dish -> dish.isSpicy());
        assertThat(hasSpicyFood, is(true));
    }

    @Test
    public void allAreSpicyFood() throws Exception {
        boolean allAreSpicy = dishs.stream().allMatch(dish -> dish.isSpicy());
        assertThat(allAreSpicy, is(false));
    }
    @Test
    public void allAreNotSpicyFood() throws Exception {
        boolean allAreNotSpicy = dishs.stream().noneMatch(dish -> dish.isSpicy());
        assertThat(allAreNotSpicy, is(false));
    }

}
