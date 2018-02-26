package md.tekwill;

public class Exercise6 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

	 /* Use JDK documentation for String class and find a method that
	  would help you identify the position of word 'Eugen' in the names string.

	  Then find another method that would help you print the string from that position till the end.
	  Expected output: "Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad"
	  */

        int eugen = names.indexOf("Eugen");
        String remainingString = names.substring(eugen);
        System.out.println(remainingString);
    }
}
