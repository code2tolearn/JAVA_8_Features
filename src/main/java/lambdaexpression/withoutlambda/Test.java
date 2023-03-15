package lambdaexpression.withoutlambda;

import lambdaexpression.Greeting;

// Have to implement 20 different classes for 20 different languages
// this  approach  is not recommended
public class Test {
    public static  void wish(Greeting greeting)
    {
        greeting.greet();
    }

    public static void main(String[] args) {

        EnglishGreeting greeting = new EnglishGreeting() ;
        wish(greeting);

        HindiGreeting greeting1 = new HindiGreeting() ;
        wish(greeting1);

    }
}
