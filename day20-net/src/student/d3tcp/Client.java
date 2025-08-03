package student.d3tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",8888);

        new ClientReaderTread(socket).start();

        OutputStream os = socket.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请说：");
            String str = sc.nextLine();
            if("exit".equals(str)){
                dos.close();
                socket.close();
                System.out.println("结束啦");

                break;

            }
            dos.writeUTF(str);
            dos.flush();

        }


    }
}
