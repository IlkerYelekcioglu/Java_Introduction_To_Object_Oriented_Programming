package enums.day;

import enums.day.Day;

public class Days {
    public static void main(String[] args) {

        String nameOfDay = Day.FRIDAY.name();
        System.out.println(nameOfDay);

        int ordinal = Day.TUESDAY.ordinal();
        System.out.println(ordinal);

        Day[] days = Day.values();
        for(Day day: days)
            System.out.println(day);
    }
}
