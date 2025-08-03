package student.dtcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws Exception {

        System.out.println("服务端启动完成");

        ServerSocket serverSocket = new ServerSocket(8888);

        /*public ThreadPoolExecutor(int corePoolSize,
                                    int maximumPoolSize,
                                    long keepAliveTime,
                                    TimeUnit unit,
                                    BlockingQueue<Runnable> workQueue,
                                    ThreadFactory threadFactory)*/

        ThreadPoolExecutor pool = new ThreadPoolExecutor(16*2,16*2,0,TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        while (true){
            Socket socket = serverSocket.accept();

            System.out.println("有人上线了" + socket.getRemoteSocketAddress());

            // Thread继承了Runnable接口
            pool.execute(new ServerReaderThread(socket));



        }
    }
}
