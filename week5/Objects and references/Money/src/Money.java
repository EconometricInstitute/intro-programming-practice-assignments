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
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        if (newCents >= 100) {
            newEuros++;
            newCents = newCents - 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents <= compared.cents) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
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
