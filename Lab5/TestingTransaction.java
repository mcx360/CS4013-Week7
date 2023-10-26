package Lab5;

public class TestingTransaction {
    public static void main(String[] args) {
        
        //prints the state of the account before the transactions, then prints the transactions, and finally prints the final state of the account
        CurrentAccount myCurrentAccount = new CurrentAccount(1000,2,"myCurrentAccount");
        System.out.println(myCurrentAccount.toString());
        myCurrentAccount.deposit(1600, "Funds transfer");
        myCurrentAccount.withdraw(800, "rent");
        System.out.println(myCurrentAccount.showTransactions());
        System.out.println(myCurrentAccount.toString());

        //prints the state of the account before the transactions, then prints the transactions, and finally prints the final state of the account
        SavingsAccount mySavingAccount = new SavingsAccount(2000, 2, "mySavingAccount");
        System.out.println(mySavingAccount.toString());
        mySavingAccount.deposit(1000, "savings");
        mySavingAccount.deposit(2000, "more savings");
        System.out.println(mySavingAccount.showTransactions());
        System.out.println(mySavingAccount.toString());
    }
}
