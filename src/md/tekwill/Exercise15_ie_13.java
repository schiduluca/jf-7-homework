package md.tekwill;

import java.time.LocalDate;

public class Exercise15_ie_13 {

    public static void main(String[] args) {
        /*
        * Use Gauss algorithm to determine the easter for 2018 in the JULIAN calendar.
        *
        * https://en.wikipedia.org/wiki/Computus
        *
        * Output day=26, month=3, year=2018
        * */

        Exercise15_ie_13 main = new Exercise15_ie_13();
        LocalDate localDate = main.easterDate(2011);
        System.out.println(localDate);
    }

    private LocalDate easterDate(int year) {
        int a = year % 4;
        int b = year % 7;
        int c = year % 19;
        int d = (19*c + 15) % 30;
        int e = (2*a + 4*b - d + 34) % 7;
        int month = (int) Math.floor((d + e + 114)/31.0);
        int day = ((d + e + 114) % 31) + 1;
        return LocalDate.of(year, month, day);
    }
}
