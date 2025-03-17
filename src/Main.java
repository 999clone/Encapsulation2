import Bank.*;

public class Main {
    public static void main(String[] args){
        BankCustomers bank = new BankCustomers();

        SavingAccount savingAccount1 = new SavingAccount("1001", "mamad", 5000);
        SavingAccount savingAccount2 = new SavingAccount("1002", "ali", 7000);
        SavingAccount savingAccount3 = new SavingAccount("1003", "gholi", 6000);

        TransactionAccount transactionAccount1 = new TransactionAccount("2001", "asghar", 3000);
        TransactionAccount transactionAccount2 = new TransactionAccount("2002", "mamali", 2000);
        TransactionAccount transactionAccount3 = new TransactionAccount("2003", "hafezShirazi", 4000);

        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);

        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);
        //serfan esm mizaram ta malom bashe gij nashid:
        BankAccount foundAccount = bank.findAccount("1001");//inja payami nemide ke found shode choon faghat baraye not found matn gozashtam
        BankAccount notFoundAccount = bank.findAccount("7001");

        //be hesab 1001 mikham ezzafe konam:

        System.out.println(foundAccount.getBalance());
        foundAccount.deposit(1000);
        System.out.println(foundAccount.getBalance());

        //be hesab 1002 mikham mablagh nadorost ezafe konam:

        bank.findAccount("1002").deposit(-10000);

        bank.findAccount("1003").calculateInterest();
        bank.findAccount("1003").getBalance();

        bank.findAccount("2002").calculateInterest();
        bank.findAccount("2002").getBalance();

        bank.findAccount("2002").withdraw(1000);
        bank.findAccount("2002").withdraw(-2000);
        bank.findAccount("2002").withdraw(30000);

        bank.showAllBalances();

    }
}