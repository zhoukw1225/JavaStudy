package student.rate;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        double[] score = getrate(5);
        System.out.println(getscore(score));
    }
    public static double max(double[] arr ){
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double min(double[] arr ){
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static double[] getrate(int n){
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("第" + (i + 1) + "位裁判的打分是：");
            arr[i] = sc.nextDouble();
        }
        return arr;
    }


    public static double getscore(double[] arr){
        double sum = 0;
        double max = max(arr);
        double min = min(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (arr.length <= 2){
            System.out.println("打分数量不足,直接采用平均数");
            return sum/arr.length;
        }else{
            return (sum -max - min)/ (arr.length-2);
        }

    }
}
