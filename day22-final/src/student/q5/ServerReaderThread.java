package student.q5;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

import static student.q5.Server.FILE_PATH;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                ){
            while (true) {
                String checkMethod;
                try {
                    checkMethod = dataInputStream.readUTF();
                } catch (EOFException e) {
                    System.out.println("客户端断开连接");
                    break;
                }

                String username = dataInputStream.readUTF();
                String password = dataInputStream.readUTF();

                if (checkMethod.equals("login")) {
                    String loginInfo = login(username, password);
                    dataOutputStream.writeUTF(loginInfo);
                    dataOutputStream.flush();
                } else if (checkMethod.equals("register")) {
                    String registerInfo = register(username, password);
                    dataOutputStream.writeUTF(registerInfo);
                    dataOutputStream.flush();
                }
            }
        } catch (Exception e) {
            System.out.println("有人离线了");
        }
    }

    private String register(String username, String password) throws Exception {
        if(exist(username)){
            return "duplicate username";
        }else{
            Properties prop = new Properties();
            prop.setProperty(username,password);
            prop.store(new FileWriter(FILE_PATH,true),"");

            return "success";
        }

    }

    private String login(String username, String password) throws Exception {
        if(!exist(username)){
            return "not exist username";
        }else if(!exist(username,password)){
            return "wrong password";
        }else {
            return  "success";
        }
    }

    private boolean exist(String username) throws Exception {
        boolean flag = false;
        File file = new File(FILE_PATH);
        if(file.exists()){
            Properties prop = new Properties();
            prop.load(new FileReader(FILE_PATH));
            if(prop.containsKey(username)){
                flag = true;
            }
        }
        return flag;
    }

    private boolean exist(String username,String password) throws Exception {
        boolean flag = false;
        File file = new File(FILE_PATH);
        if(file.exists()){
            Properties prop = new Properties();
            prop.load(new FileReader(FILE_PATH));
            if(prop.containsKey(username) && prop.getProperty(username).equals(password)){
                flag = true;
            }
        }
        return flag;
    }
}
