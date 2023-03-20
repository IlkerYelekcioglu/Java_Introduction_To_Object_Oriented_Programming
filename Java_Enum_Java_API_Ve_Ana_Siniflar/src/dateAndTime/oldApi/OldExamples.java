package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class OldExamples {

    public static void main(String[] args) {

        Date java8ReleaseDate1 = new Date(114, 2, 18);
        System.out.println(java8ReleaseDate1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        Calendar java8ReleaseDate2 = Calendar.getInstance();
        java8ReleaseDate2.setTime(java8ReleaseDate1);
        System.out.println(java8ReleaseDate2);

        java8ReleaseDate2 = new GregorianCalendar(2014, 2, 18);
        System.out.println(sdf.format(java8ReleaseDate2.getTime()));
    }
}
