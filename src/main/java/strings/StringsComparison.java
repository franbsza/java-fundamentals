/*

We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

A < B < C < ... < Y < Z < a < b ... < y < z

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string.
For example, the substrings of abc are a, b, c, ab, bc, and abc.

Given a string, s , and an integer, k , complete the function so that it finds the
lexicographically smallest and largest substrings of length .

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
 */

package strings;

public class StringsComparison {

    String getMinumumString(String words, int k){
        String smallest = "z";
        String largest = "A";

        for (int i=0; i< words.length(); i++){

            String piece = words.substring(i, i+k);

            smallest = getSmall(smallest, piece);
            largest = getLargest(largest, piece);

            if(i == words.length() - k){
                break;
            }
        }


        return smallest + "\n" + largest;
    }

    static String getSmall(String a, String b){

       if(a.compareTo(b) <= 0){
            return a;
       }
       return b;
    }

    static String getLargest(String a, String b){

         if (b.compareTo(a) > 0) {
            return b;
        }
         return a;
    }
}
