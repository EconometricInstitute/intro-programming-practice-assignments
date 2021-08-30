import java.util.ArrayList;
import java.util.List;

public class RemoveLast {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(List<String> strings) {
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        }
    }
}
