import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import utilities.DayOfWeekFormatter;

public class DayOfWeekFormatterTest {

    @InjectMocks
    DayOfWeekFormatter dayOfWeekFormatter = new DayOfWeekFormatter();

    @ParameterizedTest
    @CsvSource(delimiter = '|',value = {
            "2012 | 4 | 06 | FRIDAY ",
            "2015 | 8 | 15 | SATURDAY ",
            "2017 | 1 | 15 | SUNDAY ",
            "2017 | 1 | 16 | MONDAY ",
            "2017 | 1 | 17 | TUESDAY ",
            "2017 | 1 | 18 | WEDNESDAY ",
            "2017 | 1 | 19 | THURSDAY ",
            "2017 | 1 | 20 | FRIDAY ",
    })
    @DisplayName("test method that use GregorianCalendar class")
    public void executeTestOne(int year, int month, int day, String expected){

        String actual = dayOfWeekFormatter.formatWithCalendar(year, month, day);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(delimiter = '|',value = {
            "2012 | 4 | 06 | FRIDAY ",
            "2015 | 8 | 15 | SATURDAY ",
            "2017 | 1 | 15 | SUNDAY ",
            "2017 | 1 | 16 | MONDAY ",
            "2017 | 1 | 17 | TUESDAY ",
            "2017 | 1 | 18 | WEDNESDAY ",
            "2017 | 1 | 19 | THURSDAY ",
            "2017 | 1 | 20 | FRIDAY ",
    })
    @DisplayName("test method that use LocaleDateTime class")
    public void executeTestTwo(int year, int month, int day, String expected){

        String actual = dayOfWeekFormatter.formatWithLocalDate(year, month, day);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(delimiter = '|',value = {
            "2012 | 4 | 06 | FRIDAY ",
            "2015 | 8 | 15 | SATURDAY ",
            "2017 | 1 | 15 | SUNDAY ",
            "2017 | 1 | 16 | MONDAY ",
            "2017 | 1 | 17 | TUESDAY ",
            "2017 | 1 | 18 | WEDNESDAY ",
            "2017 | 1 | 19 | THURSDAY ",
            "2017 | 1 | 20 | FRIDAY ",
    })
    @DisplayName("test method that use LocaleDate class")
    public void executeTestThree(int year, int month, int day, String expected){

        String actual = dayOfWeekFormatter.formatWithLocalDateTime(year, month, day);
        Assertions.assertEquals(expected, actual);
    }
}
