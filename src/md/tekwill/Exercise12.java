package md.tekwill;

public class Exercise12 {

    public static void main(String[] args) {
        String names = "Alexei,Andrei,Eugen,Jana,Luca,Olea,Serghei,Sergiu,Victor,Vitalie,Vlad";

       /*
       * Use JDK documentation for StringBuilder class and find the method that
       * would help you print the string in reverse order.
       * Output: "dalV,eilatiV,rotciV,uigreS,iehgreS,aelO,acuL,anaJ,neguE,ierdnA,iexelA"
       * */

        System.out.println(new StringBuilder(names).reverse());

    }
}
