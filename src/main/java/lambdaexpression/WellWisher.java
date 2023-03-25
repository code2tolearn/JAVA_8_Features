package lambdaexpression;
// Lambda Expression
public class WellWisher {
    public static void wish(Greeting greeting)
    {
        greeting.greet();
    }

    public static void main(String[] args) {
        wish(() -> System.out.println("Hello , Good Morning.........!!" ) ) ;

        Greeting hindiGreeting = () -> System.out.println("Namaskar.........||") ;
        hindiGreeting.greet();
        Greeting englishGreeting =  () -> System.out.println("Hello , . Good Morning.........!!") ;
        englishGreeting.greet();

    }
    /*
    *  wish(greeting){}
    * wish( No of methods on greeting )
    * wish(  public void greet(){System.out.print("Hello  ,Good Morning...........!!")})
    * wish(() -> System.out.println("Hello , Good Morning.........!!" ) ) ;
     */
}

