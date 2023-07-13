/*
Calculate the min , max and the average temperature in a varargs

Update: these methods were refactoring using Stream API , notice how simple it gets to read;)
 */

package loops;

import java.util.Arrays;

public class TemperatureCalc {

    public int maxTemperature(int... temperatures){
        return Arrays.stream(temperatures).max().getAsInt();
    }

    public int minTemperature(int... temperatures){
        return Arrays.stream(temperatures).min().getAsInt();
    }

    public int averageTemperature(int... temperatures){
        return (int) Arrays.stream(temperatures).average().getAsDouble();
    }
}
