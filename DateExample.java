import java.time.LocalDate;

public class DateExample {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();

        
        LocalDate yesterday = today.minusDays(1);
        LocalDate tomorrow = today.plusDays(1);

        
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tomorrow);
    }
}