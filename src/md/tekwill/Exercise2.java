package md.tekwill;

public class Exercise2 {

    public static void main(String[] args) {
        String abracadabra = "abracadabra";

       /* Use JDK documentation for String class and find a method that
        would help you determine all the indexes of the letter 'a' in abracadabra.
        Output: Print all letter 'a' indexes on a separate line.
        */
        int index = 0;
        while ((index = abracadabra.indexOf("a", index)) != -1) {
            System.out.println(index);
            index++;
        }
    }
}
