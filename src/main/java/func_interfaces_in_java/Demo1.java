package func_interfaces_in_java;

public class Demo1 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0 ; i<10 ; i++)
                {
                    System.out.println(i);
                }
            }
        } ;
       r.run();
    }
}
