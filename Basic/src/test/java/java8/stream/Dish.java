package java8.stream;

public class Dish {
    private boolean isSpicy;
    private String name;

    public Dish(boolean isSpicy, String name) {
        this.isSpicy = isSpicy;
        this.name = name;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public String getName() {
        return name;
    }

}
