package Lab5;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private static final LocalDateTime dateCreated = LocalDateTime.now();
    private String name;
    private ArrayList<Transactions> accountTransactions = new ArrayList<>();

    public BankAccount(int id,double balance){
        this.id=id;
        this.balance=balance;
    }

    public BankAccount(int id,double balance,String name){
        this.id=id;
        this.balance=balance;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        BankAccount.annualInterestRate = annualInterestRate;
    }

    public LocalDateTime getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public void withdraw(double amount, String description){
        setBalance(balance-amount);
        Transactions withdrawTransaction = new Transactions(true, amount, getBalance(), description);
        accountTransactions.add(withdrawTransaction);
    }

    public void deposit(double amount, String description){
        setBalance(balance+amount);
        Transactions depositTransaction = new Transactions(false, amount, getBalance(), description);
        accountTransactions.add(depositTransaction);
    }

    public ArrayList<Transactions> getaccountTransactions(){
        return accountTransactions;
    }

    public void addTransaction(Transactions transaction){
        accountTransactions.add(transaction);
    }


    @Override
    public String toString(){
        if(name!=null){
            return name+"\nBalance: "+balance+"\nAccount Id: "+id+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate+"\n";
        }
        else{
            return "Balance: "+balance+"\nAccount Id: "+id+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate+"\n";
        }
    }

    public String showTransactions(){
        String transactionHistory="------"+getName()+" transaction history------\n";
        for(int i=0;i<accountTransactions.size();i++){
            transactionHistory+=accountTransactions.get(i).toString()+"\n";
        }
        return transactionHistory;
    }
}
