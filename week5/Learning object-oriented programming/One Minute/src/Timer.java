public class Timer {
    private ClockHand hundredsClock;
    private ClockHand secondsClock;

    public Timer() {
        hundredsClock = new ClockHand(100);
        secondsClock = new ClockHand(60);
    }

    public void advance() {
        if (hundredsClock.value() == 99) {
            secondsClock.advance();
        }
        hundredsClock.advance();
    }

    public String toString() {
        return secondsClock.value() + ":" + hundredsClock.value();
    }
}
