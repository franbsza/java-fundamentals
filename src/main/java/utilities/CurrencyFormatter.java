/*
Given a number convert  into the US, Indian, Chinese, and French currency formats.
Then print the formatted values as follows:

Example:

Input
12324.134

Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

 */

package utilities;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    public String formatLocale(double number, String local){

        NumberFormat fmt;

        switch (local){
            case "USA":
                fmt = NumberFormat.getCurrencyInstance(Locale.US);
                return fmt.format(number);
            case "India":
                Locale in = new Locale("en", "IN");
                fmt = NumberFormat.getCurrencyInstance(in);
                return fmt.format(number);
            case "China":
                fmt = NumberFormat.getCurrencyInstance(Locale.CHINA);
                return fmt.format(number);
            case "France":
                fmt = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                return fmt.format(number);
            default:
                return "Invalid local";
        }
    }
}
