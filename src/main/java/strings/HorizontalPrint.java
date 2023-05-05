/*
The purpose is build a string that contains an array formatted  horizontally with ponctuation and inside a [ ]
Use StringBuilder is recommeded.
 */
package strings;

public class HorizontalPrint {

    public String buildText(int[] numeros ){
       StringBuilder text = new StringBuilder();
       text.append("[ ");

        for (int i=0; i < numeros.length ; i++) {

            if(i == numeros.length-1){
                text.append(numeros[i]).append( " ]");
            }
            else{
                text.append(numeros[i]).append( ", ");
            }
        }
       return text.toString();
    }
}
