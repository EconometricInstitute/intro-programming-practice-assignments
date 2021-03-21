public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
 // increase the amount of cash by the price of an affordable mean and return the change
 // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment    }
    }

    public double eatHeartily(double payment) {
   // a hearty meal costs 4.30 euros
// increase the amount of cash by the price of a hearty mean and return the change
  // if the payment parameter is not large enough, no meal is sold and the method should return the whole paymentn payment;
        }
    }

    public boolean eatAffordably(PaymentC// an affordable meal costs 2.50 euros
 // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
 // otherwise false is returned  return false;
        }
    }

    public boolean eatHeartily(Pay// a hearty meal costs 4.30 euros
// if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
// otherwise false is returned       return false;
        }
    }

    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals +
                ", number of sold hearty meals: " + this.heartyMeals;
    }
}
