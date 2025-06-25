import java.time.LocalDate;
public class DayCalcee{
    public static void main(String []args){
        LocalDate date1 = LocalDate.of(2025, 6, 25);
        LocalDate date2 = LocalDate.of(2025, 6, 27);

        LocalDate dayBetween = date1.plusDays(1);
        System.out.println("the day Between" +date1+"and"+ date2+ "is:"+ dayBetween);
    }
}
