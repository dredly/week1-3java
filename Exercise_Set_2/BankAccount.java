public class BankAccount {
    private String holderName;
    private int number;
    private int balance;

    // Constructors
    public BankAccount(String holderName, int number) {
        this.holderName = holderName;
        this.number = number;
        this.balance = 0;
    }

    public BankAccount(String holderName, int number, int balance) {
        this.holderName = holderName;
        this.number = number;
        this.balance = balance;
    }

    // Getters
    public String getHolderName() {
        return this.holderName;
    }

    public int getNumber() {
        return this.number;
    }

    public int getBalance() {
        return this.balance;
    }

    // Setters
    public void setHolderName(String newName) {
        this.holderName = newName;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance - amount < 0) {
            System.out.println("Sorry, this account does not allow overdraft");
        } else {
            this.balance -= amount;
        }
    }
}