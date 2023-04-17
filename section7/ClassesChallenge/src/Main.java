public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setNumber("01028-6");
        account.setBalance(1000.0);
        account.setCustomerName("Romulo");
        account.setEmail("rhabbiati@hotmail.com");
        account.setPhoneNumber("+44 07378 373223");

        account.deposit(100.0);
        account.withdraw(50.0);

    }

}
