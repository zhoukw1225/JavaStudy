package student.proxy;

public class Test {
    public static void main(String[] args) {
        BigStar star = new BigStar("aaa");
        Star starProxy = ProxyUtil.createProxy(star);


        System.out.println(starProxy.sing("好日子"));
        starProxy.dance();

    }
}
