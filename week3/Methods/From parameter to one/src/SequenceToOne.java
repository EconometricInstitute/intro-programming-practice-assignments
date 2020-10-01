public class SequenceToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        int index = number;
        while (index >= 1) {
            System.out.println(index);
            index = index - 1;
        }
    }
}
