import loops.PopulationGrowth;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class PopulationGrowthTest {

    @InjectMocks
    final PopulationGrowth populationGrowth = new PopulationGrowth();

    @Test
    public void executeTest(){
        double populationA = 80000;
        double populationB = 200000;
        double taxGrowthA = 1.03;
        double taxGrowthB = 1.015;

       int years = populationGrowth.calcGrowth(populationA, populationB, taxGrowthA, taxGrowthB);
        Assertions.assertEquals(63, years);
    }
}
