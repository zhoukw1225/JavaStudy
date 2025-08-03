package student.q5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

public class Client {
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;
    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private void start() throws Exception {
        Scanner sc = new Scanner(System.in);
        socket = new Socket("127.0.0.1", 8888);
        dos = new DataOutputStream(socket.getOutputStream());
        dis = new DataInputStream(socket.getInputStream());
        while (true){
            System.out.println("--------------欢迎来到客户端------------");
            System.out.println("请输入要选择的功能编号：1.注册 2.登录（输入exit退出）");
            String choice = sc.next();
            switch (choice){
                case "1":
                    register();
                    break;
                case "2":
                    login();
                    break;
                case "exit":
                    System.out.println("已退出客户端，欢迎下次使用");
                    socket.close();
                    return;
                default:
                    System.out.println("请输入正确的指令");


            }

        }
    }

    private void register() throws Exception {
        System.out.println("------------欢迎来到注册系统------------");

        while(true){
            System.out.println("请输入用户名：");
            String name = sc.next();
            if(name.equals("exit")){
                return;
            }
            System.out.println("请输入密码：");
            String password = sc.next();
            if(password.equals("exit")){
                return;
            }
            dos.writeUTF("register");
            dos.writeUTF(name);
            dos.writeUTF(password);
            dos.flush();

            String checkCorrect = dis.readUTF();
            if(checkCorrect.equals("success")){
                System.out.println("注册成功");
                break;
            }else if(checkCorrect.equals("duplicate username")){
                System.out.println("用户名重复");
            }
        }

    }

    private void login() throws Exception {
        System.out.println("------------欢迎来到登录系统------------");

        while(true){
            System.out.println("请输入用户名：");
            String name = sc.next();
            if(name.equals("exit")){
                return;
            }
            System.out.println("请输入密码：");
            String password = sc.next();
            if(password.equals("exit")){
                return;
            }

            dos.writeUTF("login");
            dos.writeUTF(name);
            dos.writeUTF(password);
            dos.flush();


            String checkCorrect = dis.readUTF();
            if(checkCorrect.equals("success")){
                System.out.println("登录成功");
                break;
            }else if(checkCorrect.equals("not exist username")){
                System.out.println("账号未注册");
            } else if(checkCorrect.equals("wrong password")) {
                System.out.println("密码错误");
            }


        }
    }
}



