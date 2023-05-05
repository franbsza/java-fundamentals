/*

In mathematics, the Fibonacci sequence (or Fibonacci sequence) is a sequence of integers,
usually starting with 0 and 1, in which each subsequent term corresponds to the sum of the
previous two.
The purpose of the method is print formatted as String the Fibonacci sequence

 */

package loops;

public class Fibonacci {

    public String buildText(int number){

        int[] sequencia = new int[number];
        StringBuilder text = new StringBuilder();

        sequencia[0] = 0;
        sequencia[1] = 1;
        text.append(0).append(",").append(1).append(",");

        for(int i = 2; i < number; i++){
            sequencia[i] = sequencia[i-1] + sequencia[i-2];
            text.append(sequencia[i]);

            if(i != number-1){
                text.append(",");
            }
        }
        text.append(".");
        return text.toString();
    }
}
