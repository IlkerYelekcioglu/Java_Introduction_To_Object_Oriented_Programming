package enums.date;

import enums.constants.DateConstants;
import enums.date.dateEnums.DayOfMonth;
import enums.date.dateEnums.Month;
import enums.date.dateEnums.Year;
public class DateTest {
    public static void main(String[] args) {
        Date1 ed1 = new Date1(-2, 25, 121213232);

        Date2 ed2 = new Date2("-8", "Ojak", "20019");

        Date1 ed3 = new Date1(DateConstants.DAY_8, DateConstants.JANUARY, DateConstants.YEAR_2019);

        Date4 ed4 = new Date4(DayOfMonth.DAY_3, Month.NOVEMBER, Year.YEAR_2019);

        Date4 ed5 = new Date4(DayOfMonth.DAY_8, Month.JANUARY, Year.YEAR_2019);

        Date4 ed6 = new Date4(DayOfMonth.DAY_2, Month.JANUARY, Year.YEAR_2021);
    }
}
