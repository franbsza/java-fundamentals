import enums.StationOfYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class StationOfYearTest {

    @InjectMocks
    StationOfYear stationOfYear = new StationOfYear();

    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
                                        "05 | january |  It's Summer!",
                                        "15 | february |  It's Summer!",
                                        "20 | march |  It's Summer!",
                                        "21 | march |  It's Autumn!" ,
                                        "01 | april |  It's Autumn!",
                                        "20 | may |  It's Autumn!",
                                        "20 | june |  It's Autumn!",
                                        "21 | june |  It's Winter!",
                                        "20 | july |  It's Winter!",
                                        "20 | august |  It's Winter!",
                                        "22 | september |  It's Winter!",
                                        "23 | september |  It's Spring!",
                                        "20 | october |  It's Spring!",
                                        "20 | november |  It's Spring!",
                                        "20 | december |  It's Spring!",
                                        "21 | december |  It's Summer!"})
    public void executeTest(int day, String month, String expected){
       String actual = stationOfYear.stationOfYear(day, month);
        Assertions.assertEquals(expected, actual);
    }
}
