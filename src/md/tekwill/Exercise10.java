package md.tekwill;

public class Exercise10 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

        /* Use JDK documentation for String class and find the methods that
	  would help you check whether names variable starts with 'Alexei' and doesn't end with 'Ion'

	  Output print:
	  'Variable value starts with Alexei'
	  'Variable value doesn't end with Ion'
	  */
        System.out.println(names.startsWith("Alexei"));
        System.out.println(names.startsWith("Ion"));
    }
}
