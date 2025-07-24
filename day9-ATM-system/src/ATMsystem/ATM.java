package ATMsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public void start(){
        while(true){
            System.out.println("===========欢迎光临ATM系统==========");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("3.退出系统");
            System.out.println("请输入你的操作指令");
            String command = sc.next();
            switch (command){
                case "1":
                    login();
                    break;

                case "2":
                    register();
                    break;

                case "3":
                    return;
                default:
                    System.out.println("错误指令，请输入正确指令");
                    break;
            }

        }
    }

    private void register() {
        System.out.println("===================系统开户====================");
        Account account = new Account();

        System.out.println("请输入您的用户名：");
        String name = sc.next();

        account.setSex(fetchUserSex());

        account.setUserName(name);

        account.setPassWord(fetchUserPassWord());

        String CardId = creatCardID();
        account.setCardId(CardId);
        account.setMoney(0);
        account.setQuotaMoney(fetchUserQuotaMoney());

        System.out.println(account.getUserName()+"您的卡号为" + account.getCardId());


        accounts.add(account);
    }

    private double fetchUserQuotaMoney() {
        System.out.println("请输入账户每次取现限额：");
        return sc.nextDouble();
    }

    private String fetchUserPassWord() {
        while (true) {
            System.out.println("请输入密码");
            String tempPassWord = sc.next().trim();
            System.out.println("请输入确认密码");
            if (sc.next().equals(tempPassWord)){
                return tempPassWord;
            }else{
                System.out.println("两次输入的密码不一致，请重新确认");
            }
        }
    }

    private char fetchUserSex() {
        while (true) {
            System.out.println("请输入您的性别：");
            char tempsex = sc.next().trim().charAt(0);
            if (tempsex == '男' || tempsex == '女') {
                return tempsex;
            }else{
                System.out.println("请输入正确的性别");
            }
        }
    }

    private String creatCardID() {
        String cardId = null;
        OUT:
        while (true) {
            cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += rand.nextInt(10);
                }
            for (int i = 0; i < accounts.size(); i++) {
                if (cardId.equals(accounts.get(i).getCardId())) {
                    continue OUT;
                }
            }
            return cardId;
        }
    }

    private void login() {
        if (accounts.isEmpty()){
            System.out.println("您好当前系统无账户");
            return;
        }
        System.out.println("===================系统登录====================");

        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.next().trim();
            for (int i = 0; i < accounts.size(); i++) {
                if (cardId.equals(accounts.get(i).getCardId())) {
                    while (true){
                        System.out.println("请输入您的密码：");
                        String PassWord = sc.next().trim();
                        if(PassWord.equals(accounts.get(i).getPassWord())){
                            SelectService(accounts.get(i));
                            return ;
                        }else{
                            System.out.println("您输入的密码有误");
                        }
                    }


                }
            }
            System.out.println("您输入的卡号不存在");


        }




    }

    private void SelectService(Account account) {
        while (true) {
            System.out.println("===========服务页面===========");
            System.out.println("1.查询存款");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    CheckAccount(account);
                    break;
                case 2:
                    depositAccount(account);
                    break;
                case 3:
                    withdrawAccount(account);
                    break;
                case 4:
                    transferAccount(account);
                    break;
                case 5:
                    changePasswordAccount(account);
                    return;
                case 6:
                    return;
                case 7:
                    if(closeAccount(account)){
                        return;
                    }
                    break;
                default:
                    System.out.println("您输入的指令有误");

            }

        }
    }

    private boolean closeAccount(Account account) {
        while (true) {
            System.out.println("您确认要注销账户吗？y/n");
            String command = sc.next().trim();
            if  (command.equals("y")){
                if(account.getMoney()!=0){
                    System.out.println("还有余额请勿销户");
                    return false;
                }
                accounts.remove(account);
                System.out.println("账号已注销");
                return true;
            }else if  (command.equals("n")){
                return false;
            }else{
                System.out.println("请输入正确指令");
            }
        }
    }

    private void changePasswordAccount(Account account) {
        while (true) {
            System.out.println("请输入当前密码");
            String passWord = sc.next().trim();
            if (passWord.equals(account.getPassWord())) {
                account.setPassWord(fetchUserPassWord());
                return;
            }else {
                System.out.println("密码输入错误");
            }
        }
    }

    private void transferAccount(Account account) {
        if (accounts.size()<2){
            System.out.println("当前总账户数量少于两个，不能转账");
            return;
        }
        OUT:
        while (true) {
            System.out.println("请输入转账账户卡号：");
            String INCardId = sc.next().trim();
            for (int i = 0; i < accounts.size(); i++) {
                if (INCardId.equals(accounts.get(i).getCardId())) {
                    System.out.println("请输入["+maskName(accounts.get(i))+"]姓氏：");
                    String Surname = sc.next().trim();
                    if (Surname.equals(Character.toString(accounts.get(i).getUserName().charAt(0)))){
                        System.out.println("请输入转账金额：");
                        double amount = sc.nextDouble();
                        if (amount <= account.getMoney()){
                            accounts.get(i).setMoney(accounts.get(i).getMoney()+amount);
                            account.setMoney(account.getMoney()-amount);
                            System.out.println("转账成功！当前账户信息如下");
                            CheckAccount(account);
                            return;
                        }else{
                            System.out.println("您的余额不足");
                            continue OUT;
                        }

                    }else{
                        System.out.println("转账姓氏输入错误");
                        continue OUT;
                    }
                }
            }
            System.out.println("转账账户卡号不存在，请重新输入");
        }
    }

    private String maskName(Account account) {
        String maskName = "*";
        for (int i = 1; i < account.getUserName().length(); i++) {
            maskName += account.getUserName().charAt(i);
        }
        return maskName;
    }

    private void withdrawAccount(Account account) {
        System.out.println("==============用户取钱=================");
        while (true) {
            System.out.println("请输入取款金额:");
            double amount = sc.nextDouble();
            if (amount <= account.getMoney() && amount <= account.getQuotaMoney()) {
                account.setMoney(account.getMoney() - amount);
                System.out.println("恭喜取钱成功，当前账户信息如下");
                CheckAccount(account);
                break;
            }else if (amount > account.getMoney()){
                System.out.println("您的余额不足，剩余金额为" + account.getMoney());
            }else if (amount > account.getQuotaMoney()){
                System.out.println("您的金额超过取款限额");
            }
        }

    }

    private void depositAccount(Account account) {
        System.out.println("==============用户存钱=================");
        System.out.println("请输入存款金额:");
        double amount = sc.nextDouble();
        account.setMoney(account.getMoney() + amount);
        System.out.println("恭喜您存钱成功，当前账户信息如下");
        CheckAccount(account);



    }

    private void CheckAccount(Account account) {
        System.out.println("===========账户信息==========");
        System.out.println("卡号：" + account.getCardId());
        System.out.println("户主：" + account.getUserName());
        System.out.println("性别：" + account.getSex());
        System.out.println("余额：" + account.getMoney());
        System.out.println("限额：" + account.getQuotaMoney());
    }
}
