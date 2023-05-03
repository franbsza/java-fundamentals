/*Test states of years in Brazil*/
package enums;

public class StationOfYear {
    Month month;

    public String stationOfYear(int day, String month) {
        this.month = Enum.valueOf(Month.class, month.toUpperCase());
        int numberOfMonth = this.month.value;

        if (numberOfMonth <= Month.FEBRUARY.value) {
            return "It's Summer!";

        } else if (numberOfMonth == Month.MARCH.value) {
            if (numberOfMonth == Month.MARCH.value && day <= 20) {
                return "It's Summer!";
            } else {
                return "It's Autumn!";
            }
        } else if (numberOfMonth == Month.APRIL.value || numberOfMonth == Month.MAY.value) {
            return "It's Autumn!";
        } else if (numberOfMonth == Month.JUNE.value) {
            if (numberOfMonth == Month.JUNE.value && day <= 20) {
                return "It's Autumn!";
            } else {
                return "It's Winter!";
            }
        } else if (numberOfMonth == Month.JULY.value || numberOfMonth == Month.AUGUST.value) {
            return "It's Winter!";
        } else if (numberOfMonth == Month.SEPTEMBER.value) {
            if (numberOfMonth == Month.SEPTEMBER.value && day <= 22) {
                return "It's Winter!";
            } else {
                return "It's Spring!";
            }
        } else if (numberOfMonth == Month.OCTOBER.value || numberOfMonth == Month.NOVEMBER.value) {
            return "It's Spring!";
        } else {
            if (day <= 20) {
                return "It's Spring!";
            } else {
                return "It's Summer!";
            }
        }
    }
}
