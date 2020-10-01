public class Fitbyte {
    private final int age;
    private final int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * age);
        return (maximumHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
