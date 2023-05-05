import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Order order = null;
        Burger b = null;
        Drink d = null;
        Side side = null;
        String burgerType = null;
        String drinkType = null;
        String drinkSize = null;
        String sideType = null;

        System.out.println("Welcome to Bill's Burger");

        while(true) {
            System.out.println("Menu:\n" +
                               "- Burgers: \n" +
                                "-- Regular (single beef patty) \n" +
                                "-- Customised (single beef patty, vegan patty, lamb patty) \n" +
                                "-- Deluxe Burger" +
                               "- Drinks: \n" +
                                "-- Coke (Small and Large)\n" +
                                "-- Coke Zero (Small and Large) \n" +
                                "-- Orange Juice (Small and Large)\n" +
                               "- Sides: \n" +
                                "-- Fries (Regular)\n" +
                                "-- Salad (Regular) \n");

            System.out.println("Which burger: ");

            burgerType = s.nextLine();
            if(burgerType.toUpperCase().charAt(0) == 'D') {
                order = new Order(new DeluxeBurger());

                System.out.println("Your order is: " + order.getBurger().getClass().getSimpleName() + "\n" +
                                "Burger: " + burgerType + "\n" +
                                "Drink: " + order.getDrink().getSize() + " " + order.getDrink().getType() + "\n" +
                                "Side: " +order.getSide().getType() + "\n" +
                                " the total price is " + order.getTotalPrice());
                break;
            } else if (burgerType.toUpperCase().charAt(0) == 'H') {
                System.out.println("Choose your patty: ");
                String pattyType = s.nextLine();
                b = Burger.burgerFactory(burgerType, pattyType);
            } else {
                b = Burger.burgerFactory(burgerType, null);
            }


            System.out.println("Choose your drink:");
            drinkType = s.nextLine();
            System.out.println("Choose your drink size: ");
            drinkSize = s.nextLine();
            d = new Drink(drinkType, drinkSize);

            System.out.println("Choose your side:");
            sideType = s.nextLine();
            side = new Side(sideType);

            order = new Order(b, d, side);

            System.out.println("Would you like anything else: ");
            String anythingElse = s.nextLine();
            if(anythingElse.toUpperCase().charAt(0) == 'N') {
                break;
            }

        }

        System.out.println("Your order is : \n" +
                            "- Burger: " + burgerType + "\n" +
                            "- Drink: " + order.getDrink().getSize() + " " + drinkType + "\n" +
                            "- Side: " + order.getSide().getType() + " " + sideType + "\n" +
                            "Total price: £" + order.getTotalPrice());

        s.close();

    }

}
