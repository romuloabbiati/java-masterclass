public class Side {

    private String type;
    private double price;

    public Side() {
        this("Fries");
    }

    public Side(String type) {
        this.type = type;
        this.price = switch(type.toUpperCase().charAt(0)) {
            case 'F' -> 2.0;
            case 'S' -> 2.5;
            default -> 2.0;
        };
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
