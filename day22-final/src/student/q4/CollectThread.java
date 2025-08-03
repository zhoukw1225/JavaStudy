package student.q4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectThread extends Thread {
    public static Map<String,Integer> map = new HashMap<>();
    private List<pocket> pocketsRain;
    private int money;

    CollectThread(List<pocket> pocketsRain, String name) {
        super(name);
        this.pocketsRain = pocketsRain;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (pocketsRain) {
                String name = Thread.currentThread().getName();
                if  (pocketsRain.isEmpty()) {
//                    System.out.println(name + "总共抢到了" + this.money);
                    map.put(name,money);
                    break;
                }
                String pocketName = pocketsRain.get(0).getName();
                System.out.println(name + "抢到了" + pocketName);
                this.money += pocketsRain.get(0).getMoney();
                pocketsRain.remove(0);
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
