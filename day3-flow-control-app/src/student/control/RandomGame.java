package student.control;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num = random.nextInt(1,101);
        int largest = 10;
        int count = 1;
        System.out.println("已生成随机数，你总共有" + largest + "次机会，请开始猜数吧：");
        int input = sc.nextInt();
        while(count < largest){
            if(input==num){
                System.out.print("猜对啦!");
                break;
            }else{
                if(input>num){
                    System.out.println("你猜的太大了,再猜一次吧，你还有"+(largest-count)+"次机会：");
                    input=sc.nextInt();
                }else{
                    System.out.println("你猜的太小了,再猜一次吧，你还有"+(largest-count)+"次机会：");
                    input=sc.nextInt();
                }
                count++;
            }
        }
        System.out.println("游戏结束！");


    }
}

