package threadDemo2;

public class Test2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        t1.start();
        t2.start();
        for (int i = 0; i < 20; i++) {

            System.out.println("main线程" + i);
            try {
                Thread.sleep(0,10); // 主线程休眠10毫秒，给其他线程执行机会
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
