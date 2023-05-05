import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import strings.HorizontalPrint;

public class HorizontalPrintTest {

    @InjectMocks
    HorizontalPrint horizontalPrint = new HorizontalPrint();

    @Test
    public void executeTest(){
        int[] numeros =  new int[]{1,2,3,4,5,6,7,8,9,10};
        String text = horizontalPrint.buildText(numeros);
        Assertions.assertEquals("[ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]", text);
    }
}
