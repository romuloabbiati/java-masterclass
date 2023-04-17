public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double amount) {
        System.out.println("Your current balance is £" + this.balance);
        this.balance += amount;
        System.out.println("You deposited " + amount + " and your balance is now £" + this.balance);
    }

    public void withdraw(double amount) {
        if(this.balance - amount < 0.0) {
            System.out.println("You cannot withdraw that amount!");
        } else {
            System.out.println("Your current balance is £" + this.balance);
            this.balance -= amount;
            System.out.println("You withdrew " + amount + " and your balance is now £" + this.balance);
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
