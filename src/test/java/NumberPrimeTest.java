import conditionals.NumberPrime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;

public class NumberPrimeTest {

    @InjectMocks
    final NumberPrime numberPrime = new NumberPrime();

    @ParameterizedTest
    @ValueSource(ints = { 1, 67, 3})
    public void verifyPrimes(int number){
       Assertions.assertTrue( numberPrime.isNumberPrime(number) );
    }

    @ParameterizedTest
    @ValueSource(ints = { 54, 90, 35})
    public void verifyNotPrimes(int number){
        Assertions.assertFalse( numberPrime.isNumberPrime(number) );
    }
}
