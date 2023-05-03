import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import recursion.PowerCalc;

public class PowerCalcTest {

    @InjectMocks
    PowerCalc powerCalc = new PowerCalc();

    @Test
    public void executeTest(){
       int result = powerCalc.calc(2, 5, 0);

        Assertions.assertEquals(32, result);
    }
}
