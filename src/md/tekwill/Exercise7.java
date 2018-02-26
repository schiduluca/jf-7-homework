package md.tekwill;

public class Exercise7 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

	 /* Use JDK documentation for String class and find a method that
	  would help you identify the position of word 'Eugen' and 'Victor' in the names string.

	  Then find another method that would help you print the string from between those positions.
	  Expected output: "Eugen,Jana,Luca,Olea,Serghei,Sergiu,"
	  */

        int eugen = names.indexOf("Eugen");
        int victor = names.indexOf("Victor");

        names = names.subSequence(eugen, victor).toString();
        System.out.println(names);
    }
}
