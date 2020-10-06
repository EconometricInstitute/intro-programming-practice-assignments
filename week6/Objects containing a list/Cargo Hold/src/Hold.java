import java.util.ArrayList;
import java.util.List;

public class Hold {
    private int maximumWeight;
    private int currentWeight;
    private List<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight + suitcase.totalWeight() <= maximumWeight) {
            suitcases.add(suitcase);
            currentWeight = currentWeight + suitcase.totalWeight();
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }
}
