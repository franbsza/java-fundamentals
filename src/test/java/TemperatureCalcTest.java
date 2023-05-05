import loops.TemperatureCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class TemperatureCalcTest {

    @InjectMocks
    TemperatureCalc temperatureCalc = new TemperatureCalc();

    @Test
    @DisplayName("Calc the min temperature")
    public void executeTestOne(){
      int min =  temperatureCalc.minTemperature(35,21,13,25,20,40,15,38,28);
        Assertions.assertEquals(13, min);
    }

    @Test
    @DisplayName("Calc the max temperature")
    public void executeTestTwo(){
        int max =  temperatureCalc.maxTemperature(35,21,13,25,20,40,15,38,28);
        Assertions.assertEquals(40, max);
    }

    @Test
    @DisplayName("Calc the average temperature")
    public void executeTestThree(){
        int average =  temperatureCalc.averageTemperature(35,21,13,25,20,40,15,38,28);
        Assertions.assertEquals(26, average);
    }
}
