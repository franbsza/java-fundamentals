import loops.SwitchDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class SwitchDayTest {

    @InjectMocks
    SwitchDay switchDay = new SwitchDay();

    @ParameterizedTest
    @CsvSource(value = { "1,SUNDAY", "2,MONDAY", "3,TUESDAY", "4,WEDNESDAY",
                        "5,THURSDAY", "6,FRIDAY", "7,SATURDAY", "8,Invalid input"})
    public void execute(String numberDay, String dayOfWeek){
        String actual = switchDay.selectDay(numberDay);
        Assertions.assertEquals(dayOfWeek, actual);
    }
}
