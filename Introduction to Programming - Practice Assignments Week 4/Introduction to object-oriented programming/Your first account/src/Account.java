public class Account {

    private String name;
    private double amount;

    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }
    
    public void withdraw(double amount) {
        this.amount -= amount;
    }

    @Override
    public String toString() {
        return name + " has a balance of " + amount;
    }
}
