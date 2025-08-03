package student.q5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final String FILE_PATH = "day22-final\\src\\users.properties";
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
