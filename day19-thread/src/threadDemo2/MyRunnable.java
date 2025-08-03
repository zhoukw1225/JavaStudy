package threadDemo2;

public class MyRunnable implements Runnable{
    @Override
        public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程输出" + i);
        }
    }
}
