package Bank;

public class TransactionAccount extends BankAccount {
    public TransactionAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    public final double overDraftLimit = 500;
    @Override
    public void calculateInterest() {
        System.out.println("there is no interest for this account");
    }
    @Override
    public void withdraw(double amount) {
        if (amount < 0)
            System.out.println("Amount can't be negative");
        else if (amount >= balance + overDraftLimit) {
            System.out.println("Amount can't be greater than balance");
        }else {
            balance -= amount;
            System.out.println("Amount has been overdraft" + " new balance = " + balance);
        }
    }
}
