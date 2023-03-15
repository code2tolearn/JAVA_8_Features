package lambdaexpression.anonymousclass;

import lambdaexpression.Greeting;

public class Test {

    public static void wish(Greeting greeting){
            greeting.greet();
    }
 // Anonymous Implementation for the interfaces

    public static void main(String[] args) {
        wish(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello .............. Good Morning");
            }
        });

        wish(new Greeting() {
            @Override
            public void greet() {
                System.out.println(" Namaskar ...............");
            }
        });
    }

}
