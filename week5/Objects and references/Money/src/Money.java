public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int newEuros = euros + addition.euros;
        int newCents = cents + addition.cents;
        if (newCents >= 100) {
            newEuros++;
            newCents = newCents - 100;
        }

        Money newMoney = new Money(newEuros, newCents);

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        } else if (euros == compared.euros) {
            if (cents <= compared.cents) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros;
        int newCents = cents - decreaser.cents;
        if (newCents < 0) {
            newEuros--;
            newCents = newCents + 100;
        }
        
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        Money newMoney = new Money(newEuros, newCents);

        // return the new Money object
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
