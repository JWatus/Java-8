package ex_15;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Dish pizza = new Dish("Pizza", false, 900);
        Dish soupVege = new Dish("Soup", true, 240);
        Dish cake = new Dish("Cake", true, 320);
        Dish sandwichWithHam = new Dish("Sandwich", false, 250);
        Dish hummus = new Dish("Hummus", true, 150);
        Dish burrito = new Dish("Burrito", false, 650);

        List<Dish> dishes = Arrays.asList(pizza, sandwichWithHam, soupVege, cake, hummus, burrito);

        //dishes.forEach(System.out::println);

        System.out.println(getMostCalloric(dishes));
    }

    public static List getMostCalloric(List<Dish> dishes) {
        return dishes.stream()
                .filter(o1 -> o1.getCalories() > 500)
                .sorted(((o1, o2) -> o1.getCalories()-o2.getCalories()))
                .map(i -> i.getName())
                .collect(toList());
    }
}
