package student.d3tcp;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
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
                    sendMsgToAll(socket,str);
                    System.out.println(socket.getRemoteSocketAddress());
                } catch (Exception e) {
                    System.out.println(socket.getRemoteSocketAddress()+"已离线");
                    Server.onLineSockets.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void sendMsgToAll(Socket self,String str) throws Exception {
        for (Socket socket : Server.onLineSockets) {
            if(socket != self) {
                OutputStream os  = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF(str);
                dos.flush();
            }
        }
    }
}
