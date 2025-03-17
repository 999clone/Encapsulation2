package Bank;

public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    private final double interestRate = 0.03;
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("added amount: " + interest + " new balance: " + balance);
    }

}
