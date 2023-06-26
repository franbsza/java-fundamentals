/*
Given two strings of lowercase English letters, A and B, perform the following operations:

1. Sum the lengths of A and B.
2. Determine if A is lexicographically larger than B (i.e.:  does B come before A in the dictionary?).
3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
 */

package strings;

public class StringsIntro {

    int sumLengths(String A, String B){
        return A.length() + B.length();
    }

    boolean isBComesBeforeA(String A,  String B){

        int posA = A.charAt(0);
        int posB = B.charAt(0);

        if(posA > posB){
            return true;
        }
        return false;
    }

    String capitalize(String A, String B){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(A.substring(0,1).toUpperCase());
        stringBuilder.append(A.substring(1));
        stringBuilder.append(" ");
        stringBuilder.append(B.substring(0,1).toUpperCase());
        stringBuilder.append(B.substring(1));

        return stringBuilder.toString();
    }
}
