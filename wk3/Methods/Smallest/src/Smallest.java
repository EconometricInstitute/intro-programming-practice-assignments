public class Smallest {
    public static void main(String[] args) {
        int answer = smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }

    public static int smallest(int number1, int number2) {
        int smallest = number1;
        if (number2 < number1) {
            smallest = number2;
        }
        return smallest;
    }
}
