package operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertTemperatureTest {
    ConvertTemperature convertTemperature = new ConvertTemperature();

    @Test
    public void executeTest(){
       double result =  convertTemperature.convertFarenheitToCelsius(100);
        Assertions.assertEquals(38, Math.ceil(result));
    }
}
