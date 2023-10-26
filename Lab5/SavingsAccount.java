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
        System.out.println("Can not withdraw funds from a savings account!");
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
