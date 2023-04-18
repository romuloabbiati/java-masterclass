public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("01028-6", 1000.0, "Romulo",
                "rhabbiati@hotmail.com", "+44 07378 373223");

        account.deposit(100.0);
        account.withdraw(50.0);

    }

}
