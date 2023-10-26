package Lab5;
import java.time.LocalDateTime;

public class CurrentAccount extends BankAccount{
    private double overDraftLimit=200;//expressed as number of dollars, default overdraft limit is set to 200
    private LocalDateTime dateCreated = getDateCreated();
    private String name;
    

    //this makes overDraftLimit set to default which is 200 dollars
    public CurrentAccount(int id,double balance){
        super(id,balance);   
    }

    

    public CurrentAccount(double balance, int id,String name){
        super(id,balance,name);
        this.name=name;
    }

    //can set a custom overdraft limit
    public CurrentAccount(double balance, int id, String name,double overDraftLimit){
        super(id, balance, name);
        this.overDraftLimit = overDraftLimit;
        this.name=name;
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
        if(name!=null){
            return name+"\nBalance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nYour overdraft limit: "+overDraftLimit+"\n";
        }
        return "Balance: "+getBalance()+"\nAccount Id: "+getId()+"\nDate created: "+dateCreated+"\nYour overdraft limit: "+overDraftLimit+"\n";
    }
}
