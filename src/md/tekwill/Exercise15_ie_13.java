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
        LocalDate localDate = main.easterDate(2018);
        System.out.println(localDate);
    }

    private LocalDate easterDate(int year) {
        int Y = year;
        int a = Y % 19;
        int b = Y / 100;
        int c = Y % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int L = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * L) / 451;
        int month = (h + L - 7 * m + 114) / 31;
        int day = ((h + L - 7 * m + 114) % 31) + 1;
        return LocalDate.of(year, month, day);
    }
}
