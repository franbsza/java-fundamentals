import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import utilities.CurrencyFormatter;

public class CurrencyFormatterTest {

    @InjectMocks
    CurrencyFormatter currencyFormatter = new CurrencyFormatter();

    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
            "59800 | USA   | $59,800.00",
            "1000  | India | Rs.1,000.00",
            "9894  | China | ￥9,894.00",
            "42000 | France | 42 000,00 €",
            "10    | NoNo   | Invalid local"})
    @DisplayName("convert currency according to local")
    public void executeTest(double number, String local, String expected){

        String currency = currencyFormatter.formatLocale(number, local);
        Assertions.assertEquals(expected, currency);
    }
}
