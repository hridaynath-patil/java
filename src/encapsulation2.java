class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder,double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance>=0) {
            this.balance=initialBalance;
        } else {this.balance=0;}
    }

    public String getAccountHolder() {
        return accountHolder;
    }  public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount>0) {
            balance +=amount;
            System.out.println("Successfully deposited: ₹" +amount);
        } else {System.out.println("Error: Deposit amount must be positive!");}
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: ₹" +amount);
        } else if (amount>balance) {System.out.println("Error: Insufficient funds!");}
        else {System.out.println("Error: Withdrawal amount must be positive!");}
    }
}

public class encapsulation2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Hridaynath Patil", 5000.0);
        System.out.println("Account Holder: " +account.getAccountHolder());
        System.out.println("Initial Balance: ₹" +account.getBalance());
        System.out.println("-----------------------------------");

        account.deposit(2500.0);
        System.out.println("Current Balance: ₹" +account.getBalance());
        System.out.println("-----------------------------------");

        account.deposit(-500); // Try to perform an invalid operation (Negative Deposit)
        System.out.println("-----------------------------------");

        account.withdraw(3000.0);
        System.out.println("Final Balance: ₹" +account.getBalance());
    }
}
