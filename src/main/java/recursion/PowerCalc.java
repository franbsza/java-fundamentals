package recursion;

public class PowerCalc {

    //  recursive method
    public int calc(int base , int expoente, int resultado){

        if(base == 0){
            System.out.println("Resultado "+ resultado);
            return resultado;
        }
        else if(base == 1 || expoente == 0){
            resultado = 1;
            System.out.println("Resultado "+ resultado);
            return resultado;
        }
        else if(resultado == 0){
            if(expoente == 1){
                resultado = base;
                System.out.println("Resultado "+ resultado);
                return resultado;
            }
            else{
                resultado =  base * base;
            }
        }
        else {
            resultado =  resultado * base;
        }

        expoente--;

        if(expoente <= 1){
            System.out.println("Resultado "+ resultado);
            return resultado;
        }

        return calc(base, expoente, resultado);
    }
}
