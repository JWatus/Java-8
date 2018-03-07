package ex_10;

import java.util.Arrays;
import java.util.Comparator;
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

        sortByCalories(dishes).forEach(System.out::println);
        System.out.println();
 //       sortByCaloriesT(dishes).forEach(System.out::println);
    }

    public static List<Dish> sortByCalories(List<Dish> dishes) {
        List<Dish> dede = dishes.stream()
                .sorted((o1, o2) -> o1.getCalories() - o2.getCalories())
                .collect(toList());
        return dede;
    }

/*    public static List<Dish> sortByCaloriesT(List<Dish> dishes) {
        return dishes.stream()
                .sorted(new Comparator<Dish>() {
                    @Override
                    public int compare(Dish dish, Dish t1) {
                        return dish.getCalories() - t1.getCalories();
                    }
                })
                .collect(toList());
    }*/




}
