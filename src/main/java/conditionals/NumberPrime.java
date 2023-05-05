/*
Verify if input is a prime number or not.
 */

package conditionals;

public class NumberPrime {
    public boolean isNumberPrime(int number){
        int[] primes = new int[]{
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29,31, 37, 41,
                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        };

        if(number > 97){
            throw new IllegalArgumentException("Invalid input. Digit a number until 97.");
        }

        for(int i = 0; i < primes.length; i++){
            int dividor = primes[i];
            int resto = number % dividor;
            int quociente =  number / dividor;

            if( resto == 0 && number != dividor){
                return false;
            }
            else if (quociente < dividor){
                return true;
            }
        }
        return false;
    }
}
