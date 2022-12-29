package util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateUtil {
        public static Boolean sameDayCompare(String dateOne, String dateTwo){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            try {
                if (simpleDateFormat.parse(dateOne).getTime() > simpleDateFormat.parse(dateTwo).getTime()){
                    return true;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return false;
        }
}
