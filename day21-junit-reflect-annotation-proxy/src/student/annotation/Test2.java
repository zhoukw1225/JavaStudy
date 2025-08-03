package student.annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test2 {
    @Test
    public void parseClass(){
        Class c =Demo.class;
        if(c.isAnnotationPresent(MyTest4.class)){
            MyTest4 myTest4= (MyTest4)c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }


    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c =Demo.class;
        Method method = c.getDeclaredMethod("test1");
        if(method.isAnnotationPresent(MyTest4.class)){
            MyTest4 myTest4= (MyTest4)method.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }
}
