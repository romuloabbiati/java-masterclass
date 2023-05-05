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
        if (type.toUpperCase().charAt(0) == 'C' && size.toUpperCase().charAt(0) == 'S') {
            this.price = switch (size.toUpperCase().charAt(0)) {
                case 'S' -> 1.5;
                case 'M' -> 2.0;
                case 'L' -> 2.5;
                default -> 1.5;
            };
        } else if(type.toUpperCase().charAt(0) == 'C' && size.toUpperCase().charAt(0) == 'L'){
            this.price = switch (size.toUpperCase().charAt(0)) {
                case 'S' -> 1.75;
                case 'M' -> 2.25;
                case 'L' -> 2.75;
                default -> 1.75;
            };
        } else if(type.toUpperCase().charAt(0) == 'J' && size.toUpperCase().charAt(0) == 'S') {
            this.price = switch (size.toUpperCase().charAt(0)) {
                case 'S' -> 1.75;
                case 'M' -> 2.25;
                case 'L' -> 2.75;
                default -> 1.75;
            };
        } else {
            this.price = switch (size.toUpperCase().charAt(0)) {
                case 'S' -> 2.0;
                case 'M' -> 2.50;
                case 'L' -> 3.0;
                default -> 2.0;
            };
        }
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
