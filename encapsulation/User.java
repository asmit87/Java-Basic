public class User {
    public static void main(String[] args) {
        E1 account = new E1();
        account.setAccountNumber(123456789);
        // account.setBalance(1000.0);
        // because we cant set balance directly, we will use deposit method to set initial balance
        System.out.println("Account Number: " + account.getAccountNumber());
        // System.out.println("Initial Balance: " + account.getBalance());
        
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        
        account.withdraw(1500.0); // Invalid withdrawal
    }
}
