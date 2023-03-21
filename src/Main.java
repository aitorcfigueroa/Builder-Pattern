public class Main {
    public static void main(String[] args) {
        Pizzas pizzaJamonyqueso = PizzaBuilder.pizza()
                .jamon(true)
                .build();

        Pizzas pizzaHawaiana = PizzaBuilder.pizza()
                .jamon(true)
                .piña(true)
                .build();

        System.out.println(pizzaJamonyqueso.toString());
        System.out.println(pizzaHawaiana.toString());
    }
}
