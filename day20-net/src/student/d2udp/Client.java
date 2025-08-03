package student.d2udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(7777);


        Scanner sc = new Scanner(System.in);
        while (true) {
            String str  = sc.nextLine();
            if(str.equals("exit")){
                System.out.println("使用结束，欢迎下次光临");
                socket.close();
                break;
            }
            byte[] bytes = str.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getLocalHost(),6666);
            socket.send(packet);
            System.out.println("---------客户端已发送---------");
        }
    }
}
