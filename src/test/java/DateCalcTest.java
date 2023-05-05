import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import utilities.DateCalc;

import java.time.LocalDate;

public class DateCalcTest {

    @InjectMocks
    DateCalc dateCalc = new DateCalc();

    @Test
    public void executeTestDays(){
        LocalDate init = LocalDate.now();
        LocalDate end = LocalDate.of(2024, 8,6);
        int days = dateCalc.differenceOfDaysBetweenDates(init, end);

        Assertions.assertEquals(2, days);
    }

    @Test
    public void executeTestMonths(){
        LocalDate init = LocalDate.now();
        LocalDate end = LocalDate.of(2024, 8,6);
        int months = dateCalc.differenceOfMonthsBetweenDates(init, end);

        Assertions.assertEquals(3, months);
    }

    @Test
    public void executeTestYears(){
        LocalDate init = LocalDate.now();
        LocalDate end = LocalDate.of(2024, 8,6);
        int years = dateCalc.differenceOfYearsBetweenDates(init, end);

        Assertions.assertEquals(1, years);
    }
}
