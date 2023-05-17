import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import utilities.DateCalc;

import java.time.LocalDate;

public class DateCalcTest {

    @InjectMocks
    DateCalc dateCalc = new DateCalc();
    LocalDate init;

    @BeforeEach
    void setup(){
        init = LocalDate.of(2023, 5, 5);
    }

    @Test
    public void executeTestDays(){
        LocalDate end = LocalDate.of(2024, 8,15);
        int days = dateCalc.differenceOfDaysBetweenDates(init, end);

        Assertions.assertEquals(10, days);
    }

    @Test
    public void executeTestMonths(){
        LocalDate end = LocalDate.of(2024, 8,6);
        int months = dateCalc.differenceOfMonthsBetweenDates(init, end);

        Assertions.assertEquals(3, months);
    }

    @Test
    public void executeTestYears(){
        LocalDate end = LocalDate.of(2024, 8,6);
        int years = dateCalc.differenceOfYearsBetweenDates(init, end);

        Assertions.assertEquals(1, years);
    }
}
