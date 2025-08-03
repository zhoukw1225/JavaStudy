package student.d2udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        DatagramSocket socket = new DatagramSocket(6666);


        DatagramPacket packet = null;
        while (true) {
            byte[] buffer = new byte[1024*64];
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            int len = packet.getLength();

            String s = new String(buffer, 0, len);
            System.out.println(s);
        }

    }
}
