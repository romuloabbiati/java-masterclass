public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("00000-0", 50.0, "Default name", "default@email.com",
                "+44 7777 777777");
        System.out.println("Empty constructor called!");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("11111-1", 777.77, customerName, email, phoneNumber);
        System.out.println("Constructor with 3 parameters called!");
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of $" + amount + " processed, Remaining balance = $" + this.balance);
    }

    public void withdraw(double amount) {
        if(this.balance - amount < 0.0) {
            System.out.println("You cannot withdraw that amount!");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of $" + amount + " processed, Remaining balance = $" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
