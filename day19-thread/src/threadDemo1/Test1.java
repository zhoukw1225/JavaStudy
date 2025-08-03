package threadDemo1;

public class Test1 {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main"+i);
        }
    }
}
