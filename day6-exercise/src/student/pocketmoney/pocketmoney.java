package student.pocketmoney;

import java.util.Random;
import java.util.Scanner;

public class pocketmoney {
    public static void main(String[] args) {
        double[] pocketmoney = getmoney(5);
        start(pocketmoney);
    }

    public static double[] getmoney(int n){
        double[] arr = new double[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the money:");
            double temp = sc.nextDouble();
            if (temp <= 0){
                System.out.println("太小气了，重新发个大的");
            }else{
                arr[i] = temp;
            }
        }
        return arr;
    }
    public static void start(double[] arr){
        int n = arr.length;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (count < n){
            System.out.println("说点什么：");
            String temp = sc.nextLine();
            int a = random.nextInt(arr.length);
            while (arr[a] == 0){
                a = random.nextInt(arr.length);
            }
            System.out.println("恭喜你抽中" + arr[a]);
            arr[a] = 0;
            count++;
        }
        System.out.println("红包抽完啦");
    }


}
