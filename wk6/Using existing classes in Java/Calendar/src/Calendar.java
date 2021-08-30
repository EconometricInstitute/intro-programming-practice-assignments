import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
   public List<LocalDate> dates = new ArrayList<>();
   
   public Calendar() {
       dates = new ArrayList<>();
   }
   
   public void addDate(LocalDate date) {
       dates.add(date);
   }
   
   public void print() {
       if (dates.isEmpty()) {
           System.out.println("Calendar is empty");
       } else {
           System.out.println("Dates in the calendar are:");
           for (LocalDate date : dates) {
               System.out.println(date);
           }
       }
   }
   
   public LocalDate getLatestDate() {
       if (dates.isEmpty()) {
           return null;
       }
       
       LocalDate latestDate = dates.get(0);
       for (LocalDate date : dates) {
           if (date.isAfter(latestDate)) {
               latestDate = date;
           }
       }
       return latestDate;
   }
}
