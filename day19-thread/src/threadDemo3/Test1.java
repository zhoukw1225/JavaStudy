package threadDemo3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) {
        Callable<String> call = new MyCallable(100);
        FutureTask<String> futureTask = new FutureTask<String>(call);
        new Thread(futureTask).start();

        String rs = null;
        try {
            rs = futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(rs);
    }
}
