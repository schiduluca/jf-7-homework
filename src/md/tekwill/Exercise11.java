package md.tekwill;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise11 {

    public static void main(String[] args) {
        String[] names = {"Alexei", "Andrei", "Eugen", "Jana",
                "Luca", "Olea", "Serghei", "Sergiu", "Victor",
                "Vitalie", "Vlad"};

       /*
       * Use the StringBuilder to join all the array elements into one single string.
       * Elements should be comma separated.
       *
       * Output: "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad"
       * */

        /**
         * @link Collectors#joining() method uses StringBuilder inside, so I guess it's legit
         */
        String collect = Arrays.stream(names)
            .collect(Collectors.joining(", "));

        System.out.println(collect);
    }
}
