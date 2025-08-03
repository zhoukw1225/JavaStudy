package student.q1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class q1 {
    public static void main(String[] args) {
        ArrayList<prisoner> prisoners =  getNewPrisoners();
        while(prisoners.size()>1){
            prisoners = kill(prisoners);
        }
        System.out.println("幸存者编号为："+prisoners.get(0).getNum());
        System.out.println("初始位置为：" + prisoners.get(0).getPlace());


    }

    private static ArrayList<prisoner> kill(ArrayList<prisoner> prisoners) {
        for(int i=prisoners.size()-1;i>=0;i--){
            if (i%2==0){
                prisoners.remove(i);
            }
        }
        return prisoners;
    }

    private static ArrayList<prisoner> getNewPrisoners() {
        ArrayList<prisoner> prisoners = new ArrayList<>();
        Random rand = new Random();
        Set<Integer> nums =  new HashSet<>();
        int place = 1;
        for (int i = 0; i < 100; i++) {
            while (true) {
                int num = rand.nextInt(1,201);
                if (nums.add(num)) {
                    prisoners.add(new prisoner(num,place++));
                    break;
                }
            }
        }
        return prisoners;
    }
}
