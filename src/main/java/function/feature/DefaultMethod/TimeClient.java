package function.feature.DefaultMethod;

import java.time.*;

/**
 * Created by joqk12345 on 4/3/17.
 * www.github.com/joqk12345
 */
public interface TimeClient {

    void setTime(int hour,int minute ,int second);

    void setDate(int day,int month,int year);

    void setDateAndTime(int day,int month ,int year,int hour,int minute ,int second);

    LocalDateTime getLocalDateTime();

    static ZoneId getZoneId(String zoneString){
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            e.printStackTrace();
            System.err.println("Invilid time zone"+zoneString+": using default time zone instead");
            return ZoneId.systemDefault();
        }
    }

    default ZonedDateTime getZonedDateTime(String zoneString){
        return ZonedDateTime.of(getLocalDateTime(),getZoneId(zoneString));
    }
}
