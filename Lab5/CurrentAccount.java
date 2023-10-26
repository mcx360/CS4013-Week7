package Lab5;

public class CurrentAccount extends BankAccount{
    private double overDraftLimit=200;//expressed as number of dollars, default overdraft limit is set to 200
    

    //this makes overDraftLimit set to default which is 200 dollars
    public CurrentAccount(int id,double balance){
        super(id,balance);   
    }

    

    public CurrentAccount(double balance, int id,String name){
        super(id,balance,name);
    }

    //can set a custom overdraft limit
    public CurrentAccount(double balance, int id, String name,double overDraftLimit){
        super(id, balance, name);
        this.overDraftLimit = overDraftLimit;
    }

    
    
    @Override
    public void withdraw(double amount,String description){
        if((getBalance()+overDraftLimit)-amount>=0){
            //getBalance()-=amount;
            setBalance(getBalance()-amount);
            Transactions withdrawTransaction = new Transactions(true, amount, getBalance(), description);
            addTransaction(withdrawTransaction);
        }
        
        else{
            //nothing happens as payment is declined
        }
        
    }

    @Override
    public String toString(){
        if(getName()!=null){
            return getName()+"\nBalance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+getDateCreated()+"\nYour overdraft limit: "+overDraftLimit+"\n";
        }
        else{
            return "Balance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+getDateCreated()+"\nYour overdraft limit: "+overDraftLimit+"\n";
        }
    }
}
