package student.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<pocket> pocketsRain = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            pocketsRain.add(new bigPocket(i+1));
        }
        for (int i = 0; i < 160; i++) {
            pocketsRain.add(new smallPocket(i+1));
        }

        Collections.shuffle(pocketsRain);

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread thread = new CollectThread(pocketsRain,"员工"+(i+1));
            thread.start();
            threads.add(thread);
        }
        for (int i = 0; i < 100; i++) {
            try {
                threads.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        CollectThread.map.entrySet().stream().sorted(
                (o1, o2) -> o2.getValue().compareTo(o1.getValue())).limit(5)
                .forEach(entry -> System.out.println(entry.getKey()+"---->"+entry.getValue()));


    }
}
