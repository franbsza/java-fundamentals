package operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StorePaintTest {

    StorePaint storePaint = new StorePaint();

    @ParameterizedTest
    @CsvSource(value = { "4,1.0", "343,58.0", "250,42.0", "182,31.0"})
    public void calculateLitersOfPaint(double area, double expected){
       double litres = storePaint.calculateLitersOfPaint(area);
        Assertions.assertEquals(expected, litres);
    }

    @ParameterizedTest
    @CsvSource(value = { "1,0", "58.0,3", "250,14.0", "31.0,1.72"})
    public void calcCanBig(double litres, double expected){
        double can = storePaint.calcCanBig(litres);
        Assertions.assertEquals(Math.round(expected), Math.round(can));
    }

    @ParameterizedTest
    @CsvSource(value = { "1,1.0", "343,96.0", "250,70.0", "31.0,9.0"})
    public void calcCanSmall(double litres, double expected){
        double can = storePaint.calcCanSmall(litres);
        Assertions.assertEquals(Math.round(expected), Math.round(can));
    }

    @ParameterizedTest
    @CsvSource(value = { "12,S,300.0", "34,B,2720.0", "2,B,160.0", "9.0,S,225"})
    public void calcPrice(double can, char size, double expected){
        double price = storePaint.calcPrice(can, size);
        Assertions.assertEquals(expected, price);
    }

    @ParameterizedTest
    @CsvSource(value = { "1212,930.0", "343,290.0", "250,210.0", "182,160.0"})
    public void optimizeSpend(double area, double expected){
        double bestPrice = storePaint.optimizeSpend(area);
        Assertions.assertEquals(expected, bestPrice);
    }
}
