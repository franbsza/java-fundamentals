package loops;

import java.util.stream.IntStream;

public class MultiplicationTable {

    public static void buildTableText(int factor){
        System.out.println("Multiplication Table of"+ factor);

        IntStream.range(1,11)
                .forEach(n ->
                System.out.println(factor +" x " + n + " = " + factor * n)
            );
    }

    public static void main(String[] args){
        buildTableText(7);
    }
}
