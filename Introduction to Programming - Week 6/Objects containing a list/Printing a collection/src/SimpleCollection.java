import java.util.ArrayList;
import java.util.List;

public class SimpleCollection {
    private String name;
    private List<String> values;

    public SimpleCollection(String name) {
        this.name = name;
        values = new ArrayList<>();
    }

    public void add(String value) {
        values.add(value);
    }

    public String toString() {
        // Add implementation of method here
    }
}
