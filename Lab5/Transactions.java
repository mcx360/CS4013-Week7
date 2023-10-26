package Lab5;

import java.time.LocalDateTime;

public class Transactions{
    private LocalDateTime date = LocalDateTime.now();
    private boolean withdraw;
    private double amount;
    private double balance;
    private String description;

    public Transactions(boolean withdraw, double amount,double balance,String description){
        this.withdraw=withdraw;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
        date = LocalDateTime.now();
    }

    

    @Override
    public String toString(){
        return "Transaction type: "+withdrawOrDeposit(withdraw)+"\nTransaction date: "+date+"\nAmount: "+amount+"\nCurrent Balance: "+balance+"\nTransaction description: "+description+"\n";
    }

    public String withdrawOrDeposit(boolean withdraw){
        if(withdraw==true){
            return "Withdraw";
        }
        else{
            return "deposit";
        }
    }
}