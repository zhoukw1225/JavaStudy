package threadDemo2;

public class Test3 {
    public static void main(String[] args) {
        new Thread(() ->{
                       for(int i=0;i<10;i++){
                           System.out.println("线程输出" + i);
                       }
                    }

        ).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程输出" + i);

        }
    }
}
