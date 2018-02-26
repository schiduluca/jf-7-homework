package md.tekwill;

public class Exercise9 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";
	 /* Use JDK documentation for String class and find the methods that
	  would help you determine if 'Ion' and 'Jana' are part of the names string.

	  Output print:
	  'Ion is not part of the names variable'
	  'Jana is part of the names variable'
	  */
        System.out.println(names.contains("Ion"));
        System.out.println(names.contains("Jana"));
    }
}
