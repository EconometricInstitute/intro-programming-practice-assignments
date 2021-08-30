import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> values;

    public Stack() {
        values = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return values.isEmpty();
    }

    public void add(String value) {
        values.add(value);
    }

    public List<String> values() {
        return values;
    }

    public String take() {
        String value =  values.get(values.size() - 1);
        values.remove(values.size() - 1);
        return value;
    }
}
