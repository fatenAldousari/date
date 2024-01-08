import java.util.Date;
import java.util.Calendar;

public class App {
    public static void App(String[] args) {
        Date now = new Date();
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Current date and time: " + now);
        Date futureDate = calendar.getTime();
        System.out.println("Date after 5 days: " + futureDate);

        Date date1 = new Date(2023, 1, 15);
        Date date2 = new Date(2023, 1, 20);

        boolean isBefore = date1.before(date2);
        System.out.println("Is date1 before date2? " + isBefore);
    }

}