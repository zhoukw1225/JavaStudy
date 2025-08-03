package threadTest;

import java.util.ArrayList;
import java.util.Random;

public class MyThread extends Thread{
    private ArrayList<String> List;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public MyThread(ArrayList<String> List, String name){
        super(name);
        this.List=List;
    }


    Random random = new Random();
    @Override
    public void run() {
        String name = currentThread().getName();
        while (true) {
            synchronized (List){
                if(List.size()<10){
                    break;
                }
                String rs = List.remove(random.nextInt(List.size()));
                System.out.println(name+"发出了"+rs);
                count++;
            }
        }

    }


}
