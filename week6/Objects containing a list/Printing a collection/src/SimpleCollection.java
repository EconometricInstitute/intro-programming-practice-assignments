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
        String string = "The collection " + name;
        if (values.isEmpty()) {
            string = string + " is empty.";
        } else if (values.size() == 1) {
            string = string + " has 1 element: \n" + values.get(0);
        } else {
            string = string + " has " + values.size() + " elements:";
            for (String value : values) {
                string = string + "\n" + value;
            }
        }
        return string;
    }
}
