package Lab5;

import java.time.LocalDateTime;

public class SavingsAccount extends BankAccount{
    private double annualInterestRate = getAnnualInterestRate();
    private LocalDateTime dateCreated = getDateCreated();//Uses LocalDate.now becuase a savings account doesn't necessarily have to be created at the same time as a current account
    private String name;

    public SavingsAccount(double balance, int id){
        super(id,balance);
    }

    public SavingsAccount(double balance, int id,String name){
        super(id,balance,name);
        this.name=name;
        
    }

    @Override
    public void withdraw(double amount, String description){
        System.out.println("Can not withdraw funds from a savings account!");
    }

    @Override
    public String toString(){
        if(name!=null){
            return name+"\nBalance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate+"\n";
        }
        else{
            return "Balance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nAnnual interest rate: "+annualInterestRate+"\n";
    }
} 
}
