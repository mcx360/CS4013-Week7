package Lab5;
import java.util.ArrayList;
public class TestBankAccount {
    public static void main(String[] args) {
        ArrayList<BankAccount> michalAccounts = new ArrayList<BankAccount>();

        BankAccount michalAccount = new BankAccount(1, 1000,"michalAccount");
        michalAccount.setAnnualInterestRate(2.5);
        SavingsAccount michalSavingAccount = new SavingsAccount(500, michalAccount.getId(),"michalSavingsAccount");
        SavingsAccount houseFund = new SavingsAccount(10000, michalAccount.getId(),"houseFund");
        CurrentAccount michalCurrentAccount = new CurrentAccount(2000, michalAccount.getId(),"MichalCurrentAccount",200);
        CurrentAccount michalBackupAccount = new CurrentAccount(1200, 1, "michalBackupAccount;", 200);

        michalAccount.withdraw(600,"rent payment");
        michalSavingAccount.deposit(200, "savings for holidays");
        houseFund.deposit(1000,"more money for the house");
        michalCurrentAccount.withdraw(2200,"loaning friend some money");
        michalBackupAccount.withdraw(1500,"bought a new phone");



        michalAccounts.add(michalAccount);
        michalAccounts.add(michalSavingAccount);
        michalAccounts.add(houseFund);
        michalAccounts.add(michalCurrentAccount);
        michalAccounts.add(michalBackupAccount);

        for(int i=0;i<michalAccounts.size();i++){
            System.out.println(michalAccounts.get(i).toString()+"\n");
        }

        System.out.println(michalAccount.showTransactions());
        System.out.println(michalSavingAccount.showTransactions());

    }

}
