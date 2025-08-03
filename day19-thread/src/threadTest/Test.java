package threadTest;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>  GiftList =  new ArrayList<>();
        Random random = new Random();
        String[] gifts = {"口红","水杯","包包","电脑","游戏机"};
        for (int i = 0; i < 100; i++) {
            GiftList.add(gifts[random.nextInt(gifts.length)]+(i+1));
        }


        MyThread xm = new MyThread(GiftList,"小明");
        MyThread xh = new MyThread(GiftList,"小红");

        xh.start();
        xm.start();

        try {
            xm.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            xh.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("小明发出了" + xm.getCount());
        System.out.println("小红发出了" + xh.getCount());

    }
}
