public class Drink {

    private String type;
    private String size;
    private double price;

    public Drink() {
        this("Coke", "Small");
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        if (type.toUpperCase().charAt(0) == 'C') {
            this.price = switch (size.toUpperCase().charAt(0)) {
                case 'S' -> 1.5;
                case 'M' -> 2.0;
                case 'L' -> 2.5;
                default -> 1.5;
            };
        } else {
            this.price = switch (size.toUpperCase().charAt(0)) {
                case 'S' -> 1.75;
                case 'M' -> 2.25;
                case 'L' -> 2.75;
                default -> 1.75;
            };
        }
    }

}
