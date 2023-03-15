package lambdaexpression;

public class WellWisher1 {
    public static void main(String[] args) {
        Greeting hindi = () -> System.out.println("Hello , Good Morning.................") ;
        Greeting  english = () -> System.out.println("Namaskar") ;
        hindi.greet();
        english.greet();
        //th Approach to write lambda expression
        // To call lambda we need functional interfaces
        // lambda store into functional  interface  variable
        //  Now call the lambda Expression have to call greet method

    }
}
