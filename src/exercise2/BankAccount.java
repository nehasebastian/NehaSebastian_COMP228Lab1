package exercise2;

public class BankAccount {
    private String accoutnumber;
    private String ownername;
    private double balance;

    public BankAccount(String accoutnumber, String ownername,double balance) {
        this.accoutnumber = accoutnumber;
        this.ownername = ownername;
        this.balance = balance;
    }
    public String getAccoutnumber() {
        return accoutnumber;
    }
    public String getOwnername() {
        return ownername;
    }
    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        if(amount!=0)
        {
            this.balance = getBalance()-amount;
        }
    }

    public void deposit(double amount){
        if(amount!=0)
        {
            this.balance = getBalance()+amount;
        }
    }

    public String getAccountInfo() {
        return String.format("Account Number: %s%n"
                        +"Owner Name: %s%n"
                        +"Balance: %s%n",
                this.getAccoutnumber(),
                this.getOwnername(),
                this.getBalance()
        );
    }
}
