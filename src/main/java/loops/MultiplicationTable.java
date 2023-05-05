package loops;

public class MultiplicationTable {

    public static void buildTableText(int factor){
        System.out.println("Multiplication Table Of "+ factor);

        for(int i = 0 ; i <= 10 ; i++ ){
            System.out.println(factor +" x " + i + " = " + factor * i);
        }
    }

    public static void main(String[] args){
        buildTableText(7);
    }
}
