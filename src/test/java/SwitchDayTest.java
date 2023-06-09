import loops.SwitchDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

class SwitchDayTest {

    @InjectMocks
    SwitchDay switchDay = new SwitchDay();

    @ParameterizedTest(name = "number day {0} is {1}")
    @CsvSource(value = { "1,SUNDAY", "2,MONDAY", "3,TUESDAY", "4,WEDNESDAY",
                        "5,THURSDAY", "6,FRIDAY", "7,SATURDAY", "8,Invalid input"})
    void execute(String numberDay, String dayOfWeek){
        String actual = switchDay.selectDay(numberDay);
        Assertions.assertEquals(dayOfWeek, actual);
    }
}
