package student.d1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet = InetAddress.getLocalHost();
        System.out.println(inet.getHostName());
        System.out.println(inet.getHostAddress());

        InetAddress inet1 = InetAddress.getByName("www.baidu.com");
        System.out.println(inet1.getHostName());
        System.out.println(inet1.getHostAddress());

    }
}
