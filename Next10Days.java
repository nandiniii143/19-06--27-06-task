import java.time.LocalDate;

public class Next10Days {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();

        System.out.println("Next 10 Days:");
        for (int i = 1; i <= 10; i++) {
            
            LocalDate nextDay = today.plusDays(i);
            System.out.println(nextDay);
        }
    }
}