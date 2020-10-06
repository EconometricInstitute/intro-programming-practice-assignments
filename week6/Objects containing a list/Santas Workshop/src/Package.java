import java.util.ArrayList;
import java.util.List;

public class Package {
    private List<Gift> gifts;
    
    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;
        for (Gift gift : gifts) {
            weight = weight + gift.getWeight();
        }
        return weight;
    }
}
