public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Default name", "default@email.com");
        System.out.println("No-args constructor called!");
    }

    public Customer(String name, String email) {
        this(name, 800.00, "standard@email.com");
        System.out.println("Constructor with 2 parameters called!");
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor with 3 parameters called!");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
