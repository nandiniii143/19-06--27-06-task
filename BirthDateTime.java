import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BirthDateTime {
    public static void main(String[] args) {

        LocalDateTime birthDateTime = LocalDateTime.of(2006, 11, 9, 11, 30); 
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        
        System.out.println("Your Birth Date and Time: " + birthDateTime.format(format));
    }
}