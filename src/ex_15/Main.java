package ex_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println(showMostHeavy(dishes));
    }

    public static List<Dish> showMostHeavy(List<Dish> dishes) {
        return dishes.stream()
                .filter(a -> a.getCalories() > 500)
                .sorted((a, b) -> a.getCalories() - b.getCalories())
                .collect(Collectors.toList());
    }
}
