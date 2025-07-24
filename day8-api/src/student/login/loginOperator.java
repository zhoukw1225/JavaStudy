package student.login;

import java.util.Random;
import java.util.Scanner;

public class loginOperator {
    private account[] accounts;

    public loginOperator(account[] accounts) {
        this.accounts = accounts;
    }

    public static account sayhello(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        return new account(name,password);
    }

    public boolean check(account account){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getName().equals(account.getName()) && accounts[i].getPassword().equals(account.getPassword())){
            return true;
            }
        }
        return false;
    }

    public void loginsystem() {
        System.out.println("欢迎来到xxx登录系统");
        int chance =3;
        while (chance != 0) {
            account account = sayhello();

            if (!getyanzheng()){
                System.out.println("验证码错误");
                continue;
            }
            if(check(account)){
                System.out.println("欢迎成功登录系统，balabababa");
                break;
            }else{
                System.out.println("你的账号或密码有误，请重新输入,还剩"+--chance+"机会");

            }
        }
    }

    public static String yanzheng(int n){
        Random random = new Random();
        String yanzheng = "";
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(3);
            switch (num){
                case 0:
                    yanzheng += random.nextInt(10);
                    break;
                case 1:
                    yanzheng += (char)(random.nextInt(26)+97);
                    break;
                case 2:
                    yanzheng += (char)(random.nextInt(26)+65);
                    break;

            }
        }
        return yanzheng;
    }


    public static boolean getyanzheng(){
        String yanzheng = yanzheng(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码"+yanzheng);
        String useryanzheng = sc.nextLine();
        return yanzheng.equalsIgnoreCase(useryanzheng);
    }
}
