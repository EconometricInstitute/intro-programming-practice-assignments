public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.affordableMeals++;
            money = money + 2.50;
            return payment - 2.50;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.heartyMeals++;
            this.money = this.money + 4.30;
            return payment - 4.30;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            this.affordableMeals++;
            card.takeMoney(2.50);
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            this.heartyMeals++;
            card.takeMoney(4.30);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals +
                ", number of sold hearty meals: " + this.heartyMeals;
    }
}
