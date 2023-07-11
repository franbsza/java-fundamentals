//Task
//        Given an integer, N , print its first 10 multiples.
//        Each multiple N x i should be printed on a new line in the form: N x i = result.
//
//        Input Format
//        A single integer, N.


package functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> operators = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        operators.stream()
                .forEach(operator -> System.out.println(N + " x "+ operator + " = " + (N * operator)));
    }
}
