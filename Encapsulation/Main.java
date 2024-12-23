package Encapsulation;

class BankAccount{

    private String accountHolderName;
    private double balance;

    public BankAccount(String name, double initialBalance){
        this.accountHolderName = name;
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }else{
            System.out.println("Balance cant be nagative numbers");
            this.balance = 0;
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0) {
            balance += amount;

            System.out.println("Diposited amount : "+ amount);
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }


    public void withdraw(int amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount : " + amount);
        }else{
            System.out.println("Insufficiant funds or Invalid amount");
        }
    }

}


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Moenul",523.5);

        System.out.println(account.getAccountHolderName());
        System.out.println(account.getBalance());

        account.deposit(50);
        System.out.println("New Balance " + account.getBalance());

        account.withdraw(600);
        System.out.println("New Balance " + account.getBalance());
    }
}
