package Lab5;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance, int id){
        super(id,balance);
    }

    public SavingsAccount(double balance, int id,String name){
        super(id,balance,name);       
    }

    @Override
    public void withdraw(double amount, String description){
        Transactions withdrawTransaction = new Transactions(true, amount, getBalance(), "Declined, cannot withdraw funds from savings account");
        addTransaction(withdrawTransaction);
    }

    @Override
    public String toString(){
        if(getName()!=null){
            return getName()+"\nBalance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+getDateCreated()+"\nAnnual interest rate: "+getAnnualInterestRate()+"\n";
        }
        else{
            return "Balance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+getDateCreated()+"\nAnnual interest rate: "+getAnnualInterestRate()+"\n";
    }
} 
}
