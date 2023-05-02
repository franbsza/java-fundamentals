package loops;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

public class CurrentSalary {

    public BigDecimal executeCalc(double salary, int entryYear){
        Calendar cal = Calendar.getInstance();
        int years = cal.get(Calendar.YEAR) - entryYear;

        double currentSalary = 0;
        double increase = 0;

        for (int i=1; i <= years; i++){

            if(i == 1){
                increase = 0.015;
                currentSalary = salary *  (1 + increase);
            }
            else {
                increase = increase * 2;
                currentSalary = currentSalary *  (1 + increase);
            }
        }
        return new BigDecimal(currentSalary).setScale(2, RoundingMode.HALF_EVEN);
    }
}
