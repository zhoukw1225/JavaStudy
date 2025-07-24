package student.lottery;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int[] user = getUserNumber();
        for(int j=0;j<=5;j++){
            System.out.print(user[j]+",");
        }
        System.out.println(user[6]+";");
        int[] official = creatNumber();
        for(int j=0;j<=5;j++){
            System.out.print(official[j]+",");
        }
        System.out.println(official[6]+";");
        int bonus = judge(user,official);
        System.out.println("您得到奖金" + bonus + "元");
    }


    public static int[] getUserNumber() {
        Scanner sc = new Scanner(System.in);
        int[] user= new int[7];
        for(int i=1;i<=6;i++){
            OUT:
            while(true){
                System.out.println("输入你想选的第" + i + "个红球号码（1-33）不能重复：");
                int temp=sc.nextInt();
                if(temp<1||temp>33){
                    System.out.println("请输入1-33之间的整数");
                    continue;
                }
                for(int j=1;j<i;j++){
                    if(temp==user[j]){
                        System.out.println("请输入不重复的数字");
                        continue OUT;
                    }
                }
                user[i-1]=temp;
                break;
            }
        }
        while(true){
            System.out.println("输入你想选的蓝球号码(1-16)：");
            int temp =sc.nextInt();
            if(temp<1||temp>16){
                System.out.println("请输入1-16之间的整数");
                continue;
            }
            user[6]=temp;
            break;
        }

        return user;
    }

    public static int[] creatNumber() {
        Random random = new Random();
        int[] official = new int[7];
        for(int i=1;i<=6;i++){
            OUT:
            while(true){
                int temp=random.nextInt(33)+1;
                for (int j=1;j<i;j++){
                    if(official[j]==temp){
                        continue OUT;
                    }
                }
                official[i-1]=temp;
                break;
            }
        }
        official[6]=random.nextInt(16)+1;
        return official;
    }

    public static int judge(int[] user, int[] official) {
        int countred = 0;
        int countblue = 0;

        for (int i=0;i<=5;i++){
            for (int j=0;j<=5;j++){
                if(user[i]==official[j]){
                    countred++;
                    break;
                }
            }
        }

        if(user[6]==official[6]){
            countblue++;
        }


        if (countred==6 && countblue==1){
            return 10000000;
        }else if (countred==6){
            return 5000000;
        }else if (countred==5&&countblue==1){
            return 3000;
        }else if (countred==5||(countred==4&&countblue==1)){
            return 200;
        }else if (countred==4||(countred==3&&countblue==1)){
            return 10;
        }else if (countblue==1){
            return 5;
        } else {
            return 0;
        }
    }
}
