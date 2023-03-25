package func_interfaces_in_java;

public class Demo3 {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0 ; i<10 ; i++){
                System.out.println(i);
            }
        } ;
        r.run();
    }
}
