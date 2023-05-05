public class Order {

    private Burger burger;
    private Drink drink;
    private Side side;

    public Order() {
        this(new Burger(), new Drink(), new Side());
    }

    public Order(Burger burger) {
        this(burger, new Drink("Coke", "Large"), new Side("Fries"));
    }

    public Order(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        totalPrice += this.burger.getPrice();
        totalPrice += this.side.getPrice();
        totalPrice += this.drink.getPrice();
        return totalPrice;
    }
}
