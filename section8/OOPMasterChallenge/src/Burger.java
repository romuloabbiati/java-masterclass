import java.util.ArrayList;
import java.util.List;

public class Burger {

    private String burgerType;
    private double price;
    private String[] elements = new String[] {"Cheese", "Tomato", "Bacon", "Lettuce", "Mayo"};
    private List<String> toppings = new ArrayList<>();

    public Burger() {
        this("Beef");
    }

    public Burger(String burgerType) {
        this.burgerType = burgerType;
        this.price = switch(burgerType.toUpperCase().charAt(0)) {
            case 'B' -> 8.0;
            case 'V' -> 10.0;
            case 'L' -> 9.0;
            case 'D' -> 16.0;
            default -> 8.0;
        };
    }

    public static Burger burgerFactory(String type, String burgerType) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'R' -> new Burger();
            case 'H' -> new Burger(burgerType);
            case 'D' -> new DeluxeBurger();
            default -> new Burger();
        };
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(String element) {
        switch (element.toUpperCase().charAt(0)) {
            case 'C' -> this.price += 2.0;
            case 'T' -> this.price += 1.0;
            case 'B' -> this.price += 2.0;
            case 'L' -> this.price += 1.0;
            case 'M' -> this.price += 0.5;
            default -> this.price += 0.0;
        }
        this.toppings.add(element);
    }
}
