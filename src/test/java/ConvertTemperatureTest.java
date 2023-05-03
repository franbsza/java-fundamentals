import operators.ConvertTemperature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class ConvertTemperatureTest {
    @InjectMocks
    ConvertTemperature convertTemperature = new ConvertTemperature();

    @Test
    public void executeTest(){
       double result =  convertTemperature.convertFarenheitToCelsius(100);
        Assertions.assertEquals(38, Math.ceil(result));
    }
}
