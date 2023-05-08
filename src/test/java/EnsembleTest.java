import enums.Ensemble;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnsembleTest {

    @ParameterizedTest
    @EnumSource(value = Ensemble.class, names = {"DUET", "QUARTET", "SEPTET", "TRIPLE_QUARTET"})
    void testNumberOfMusicians(Ensemble ensemble) {
        int min = 1;
        int max = 12;
        Assertions.assertTrue(ensemble.numberOfMusicians() >= min && ensemble.numberOfMusicians() <= max);
    }
}
