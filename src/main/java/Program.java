import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int month = localDate.getMonthValue();
        System.out.println(month);

        Quarter quarter = new Quarter(month);
        System.out.println("Now quarter " + quarter.getQuarter());
    }
}
