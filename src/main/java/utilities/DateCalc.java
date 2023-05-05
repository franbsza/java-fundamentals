package utilities;

import java.time.LocalDate;
import java.time.Period;

public class DateCalc {

    public int differenceOfDaysBetweenDates(LocalDate init, LocalDate end){
        Period periodo = Period.between(init, end);
        int days = periodo.getDays();
        return days;
    }

    public int differenceOfMonthsBetweenDates(LocalDate init, LocalDate end){
        Period periodo = Period.between(init, end);
        int months = periodo.getMonths();
        return months;
    }

    public int differenceOfYearsBetweenDates(LocalDate init, LocalDate end){
        Period periodo = Period.between(init, end);
        int years = periodo.getYears();
        return years;
    }
}
