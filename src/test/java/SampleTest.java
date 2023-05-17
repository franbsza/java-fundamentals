import conditionals.Sample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    Sample sample = new Sample();

    @Test
    void verificaDivisaoExata(){
       boolean resultado = sample.verificaDivisaoExata(10, 2);
       assertTrue(resultado);
    }
}
