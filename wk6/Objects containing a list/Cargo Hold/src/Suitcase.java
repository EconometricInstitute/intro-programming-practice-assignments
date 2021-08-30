import java.util.ArrayList;
import java.util.List;

public class Suitcase {
    private int maximumWeight;
    private int currentWeight;
    private List<Item> items;
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0; 
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (currentWeight + item.getWeight() <= maximumWeight) {
            items.add(item);
            currentWeight = currentWeight + item.getWeight();
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return "1 item (" + currentWeight + " kg)";
        } else {
            return items.size() + " items (" + currentWeight + " kg)";
        }
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return currentWeight;
    }
    
    public Item heaviestItem() {
        Item maximumWeightItem = null;
        int maximumWeight = -1;
        
        for (Item item : items) {
            if (item.getWeight() > maximumWeight) {
                maximumWeightItem = item;
                maximumWeight = item.getWeight();
            }
        }
        
        return maximumWeightItem;
    }
}
