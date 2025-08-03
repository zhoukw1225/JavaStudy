package student.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star createProxy(BigStar bigstar){
        Star starproxy =  (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("dance")){
                            System.out.println("代理在帮跳舞干杂活");
                        }else if(method.getName().equals("sing")){
                            System.out.println("代理在帮唱歌干杂活");

                        }
                        return method.invoke(bigstar,args);

                    }
                });

        return starproxy;
    }
}
