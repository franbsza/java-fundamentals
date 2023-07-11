package loops;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

public class CurrentSalary {

    public BigDecimal executeCalc(double salary, int entryYear){
        Calendar cal = Calendar.getInstance();
        int years = cal.get(Calendar.YEAR) - entryYear;

        double increase = 0.015;
        double currentSalary = salary *  (1 + increase);


        for (int i=2; i <= years; i++){
                increase = increase * 2;
                currentSalary = currentSalary *  (1 + increase);
        }
        return BigDecimal.valueOf(currentSalary).setScale(2, RoundingMode.HALF_EVEN);
    }
}
