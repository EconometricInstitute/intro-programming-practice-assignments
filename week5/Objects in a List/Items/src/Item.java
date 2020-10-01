import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
   String name;
   LocalDateTime creationTime;
   
   public Item(String name) {
       this.name = name;
       creationTime = LocalDateTime.now();
   }
   
   public String toString() {
       return name + " (created at: " + creationTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + 
               ")";
   }
   
}
