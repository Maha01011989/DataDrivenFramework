package Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonUtil {
    DateTimeFormatter dtf;
    LocalDateTime now;

    public String getCurrentDateTime() {
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        now = LocalDateTime.now();
        return dtf.format(now).replace("/", "-").replace(":"," ");
    }

}
