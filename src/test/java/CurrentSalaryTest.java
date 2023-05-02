import loops.CurrentSalary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrentSalaryTest {

    @InjectMocks
    final CurrentSalary currentSalary = new CurrentSalary();

    @Test
    public void test(){
        BigDecimal expected = new BigDecimal("1551.45").setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal sal =  currentSalary.executeCalc(1400, 2020);
        Assertions.assertEquals(expected , sal);
    }
}
