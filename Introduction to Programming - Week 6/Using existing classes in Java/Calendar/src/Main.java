import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.addDate(LocalDate.of(2019,2,5));
        calendar.addDate(LocalDate.of(2020, 3, 8));
        calendar.addDate(LocalDate.of(2020, 8,1));

        calendar.print();

        System.out.println("The latest date is: " + calendar.getLatestDate());
    }
}
