public class Main {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(false);
        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);

        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();

        smartKitchen.addWater();
        smartKitchen.getBrewMaster().brewCoffee();

        smartKitchen.pourMilk();
        smartKitchen.getIceBox().orderFood();

        smartKitchen.loadDishWasher();
        smartKitchen.getDishWasher().doDishes();

    }
}
