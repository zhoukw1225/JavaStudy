package student.d3tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> onLineSockets = new ArrayList<Socket>();
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();
            onLineSockets.add(socket);
            new ServerReaderThread(socket).start();
        }

    }
}
