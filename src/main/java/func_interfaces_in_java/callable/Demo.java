package func_interfaces_in_java.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo  {

    Callable cl = new Callable() {
        @Override
        public Object call() throws Exception {
            for (int i=0 ; i<10 ; i++){
                System.out.println(i);
            }
            return null;

        }
    } ;
    ExecutorService  executorService = Executors.newFixedThreadPool(2) ;



}

