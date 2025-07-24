package student.define;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[6];
        double sum = 0;
        for (int i=1;i<7;i++){
            System.out.println("请输入第" + i + "位裁判的打分：");
            score[i-1] = sc.nextDouble();
            sum += score[i-1];
        }
        System.out.println("选手最终分数为：" + (sum / 6));

    }
}
