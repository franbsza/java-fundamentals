/*
Calculate the min , max and the average temperature in a varargs
 */

package loops;

public class TemperatureCalc {

    public int maxTemperature(int... temperatures){

        int count = temperatures.length - 1;
        int max = 0;

        do{
            if(temperatures[count] > max){
                max = temperatures[count];
            }
            count--;
        }while(count >= 0);

        return max;
    }

    public int minTemperature(int... temperatures){

        int count = temperatures.length - 1;
        int min = 99999;

        do{
            if(temperatures[count] < min){
                min = temperatures[count];
            }
            count--;
        }while(count >= 0);

        return min;
    }

    public int averageTemperature(int... temperatures){

        int count = temperatures.length - 1;
        int sum = 0;

        do{
            sum += temperatures[count];
            count--;
        }while(count >= 0);

        return sum / temperatures.length;
    }
}
