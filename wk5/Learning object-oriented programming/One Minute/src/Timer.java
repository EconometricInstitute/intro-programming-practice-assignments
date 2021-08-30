public class Timer {
    private ClockHand hundredsClock;
    private ClockHand secondsClock;

    public Timer() {
        this.hundredsClock = new ClockHand(100);
        this.secondsClock = new ClockHand(60);
    }

    public void advance() {
        if (this.hundredsClock.value() == 99) {
            this.secondsClock.advance();
        }
        this.hundredsClock.advance();
    }

    public String toString() {
        return this.secondsClock.value() + ":" + this.hundredsClock.value();
    }
}
