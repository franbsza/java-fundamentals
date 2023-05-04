package utilities;

import enums.DayOfWeek;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeekFormatter {

    public String format(int year, int month, int day) {

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
}
