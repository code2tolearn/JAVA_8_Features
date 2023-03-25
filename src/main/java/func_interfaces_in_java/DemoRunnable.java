package func_interfaces_in_java;

public class DemoRunnable implements Runnable{
    @Override
    public void run() {
         for(int i= 0 ; i< 10 ; i++){
             System.out.println(i) ;
         }
    }

    public static void main(String[] args) {
        DemoRunnable dr = new DemoRunnable();
//         Thread t = new Thread(dr) ;
//         t.start(); ;
        dr.run();
    }
}
