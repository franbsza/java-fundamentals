package utilities;

import enums.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeekFormatter {

    //worst method
    public String formatWithCalendar(int year, int month, int day) {

        Calendar c = new GregorianCalendar(year, month - 1, day);
        int dayweek = c.get(Calendar.DAY_OF_WEEK);

        if (dayweek == 1){
            return DayOfWeek.SUNDAY.name();
        } else if (dayweek == 2) {
            return DayOfWeek.MONDAY.name();
        }
        else if (dayweek == 3) {
            return DayOfWeek.TUESDAY.name();
        }
        else if (dayweek == 4) {
            return DayOfWeek.WEDNESDAY.name();
        }
        else if (dayweek == 5) {
            return DayOfWeek.THURSDAY.name();
        }
        else if (dayweek == 6) {
            return DayOfWeek.FRIDAY.name();
        }
        else {
            return DayOfWeek.SATURDAY.name();
        }
    }

    //little bit better
    public String formatWithLocalDateTime(int year, int month, int day){
        Calendar c = new GregorianCalendar(year, month - 1, day);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
        return localDateTime.getDayOfWeek().name();
    }

    //much better (since java8)
    public String formatWithLocalDate(int year, int month, int day){
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }
}
