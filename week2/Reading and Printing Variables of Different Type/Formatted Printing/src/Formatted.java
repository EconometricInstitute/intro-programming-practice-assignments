public class Formatted {
    public static void main(String[] args) {
        double longNumber = 12532.1892489;

        System.out.printf("With three digits: %.3f", longNumber);
        System.out.println();
        System.out.printf("In scientific notation: %.2e", longNumber);
    }
}
