import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDateTime {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedNow = formatter.format(now);
        System.out.println("Current date and time: " + formattedNow);
    }
}
