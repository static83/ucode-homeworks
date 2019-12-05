import java.text.SimpleDateFormat;
import java.util.Date;


public class systemTimespecificFormat {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd HH:m:s.S";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String date = sdf.format(new Date());
        System.out.println("Now: " + date);
    }
}
