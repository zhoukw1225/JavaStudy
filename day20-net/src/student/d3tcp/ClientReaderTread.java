package student.d3tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientReaderTread extends Thread{
    private Socket socket;

    public ClientReaderTread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;
        try {
            is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                String str = null;
                try {
                    str = dis.readUTF();
                    System.out.println(str);
                } catch (Exception e) {
                    System.out.println("已离线");
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
