package java8;

import java8.stream.Dish;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class OptionalTest {
    @Test
    public void basicUseOfOptional() throws Exception {
        Optional<Dish> empty = Optional.ofNullable(null);
        Dish dish = empty.orElse(new Dish(false, "no name"));
        assertThat(empty.isPresent(), is(false));
        assertThat(dish.getName(), is("no name"));
    }
}
