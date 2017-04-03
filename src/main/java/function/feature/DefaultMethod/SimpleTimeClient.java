package function.feature.DefaultMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by joqk12345 on 4/3/17.
 * www.github.com/joqk12345
 */
public class SimpleTimeClient implements TimeClient {

    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate =LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour,minute,second);
        dateAndTime =LocalDateTime.of(currentDate,timeToSet);
    }

    @Override
    public void setDate(int day, int month, int year) {
        LocalDate currentDate =LocalDate.of(day,month,year);
        LocalTime timeToSet = LocalTime.from(dateAndTime);
        dateAndTime =LocalDateTime.of(currentDate,timeToSet);

    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        LocalDate currentDate =LocalDate.of(day,month,year);
        LocalTime timeToSet = LocalTime.of(hour,minute,second);
        dateAndTime =LocalDateTime.of(currentDate,timeToSet);
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }

    @Override
    public String toString() {
        return "SimpleTimeClient{" +
                "dateAndTime=" + dateAndTime +
                '}';
    }

    public static void main(String[] args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
        System.out.println("Time in California:"+myTimeClient.getZonedDateTime("Blah blah").toString());

    }
}
