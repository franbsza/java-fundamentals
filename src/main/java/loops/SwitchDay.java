package loops;

import enums.DayOfWeek;

public class SwitchDay {
    public String selectDay(String numberDay){

        switch(numberDay){
            case "1":
                return DayOfWeek.SUNDAY.name();
            case "2":
                return DayOfWeek.MONDAY.name();
            case "3":
                return DayOfWeek.TUESDAY.name();
            case "4":
                return DayOfWeek.WEDNESDAY.name();
            case "5":
                return DayOfWeek.THURSDAY.name();
            case "6":
                return DayOfWeek.FRIDAY.name();
            case "7":
                return DayOfWeek.SATURDAY.name();
            default:
                return "Invalid input";
        }
    }
}
