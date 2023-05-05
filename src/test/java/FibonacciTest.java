import loops.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class FibonacciTest {

    @InjectMocks
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void executeTest(){
        String actual = fibonacci.buildText(12);
        Assertions.assertEquals("0,1,1,2,3,5,8,13,21,34,55,89.", actual);
    }
}
