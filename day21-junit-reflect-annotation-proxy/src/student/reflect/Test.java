package student.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        Class c2 = Class.forName("student.reflect.Student");
        Student student = new Student();
        Class c3 = student.getClass();
        Constructor constructor = c3.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor.getName() + "-->" + constructor.getParameterCount());
        constructor.setAccessible(true);
        Student s1 = (Student) constructor.newInstance("aaa",18);
        System.out.println(s1.toString());

        Field[] field = c2.getDeclaredFields();
        for (Field field1 : field) {
            field1.setAccessible(true);
            System.out.println(field1.getName() + "-->" + field1.getType());

        }
        Student s2 = new Student();
        Field fName = s2.getClass().getDeclaredField("name");
        Field fAge = s2.getClass().getDeclaredField("age");
        fName.setAccessible(true);
        fAge.setAccessible(true);
        fName.set(s2, "bbb");
        fAge.set(s2, 18);
        System.out.println(s2.toString());

        Method[] methods = c1.getDeclaredMethods();
        for (Method method1 : methods) {
            method1.setAccessible(true);
            System.out.println(method1.getName() +
                    "-->" +method1.getParameterCount()+
                    "-->" + method1.getReturnType());
        }


        Method methodSetName = s2.getClass().getDeclaredMethod("setName", String.class);
        methodSetName.setAccessible(true);
        methodSetName.invoke(s2, "ccc");
        System.out.println(s2.toString());
//        for (Constructor constructor : constructors) {
//            System.out.print(constructor.getName() + "--->");
//            Parameter[] paras = constructor.getParameters();
//            for (Parameter para : paras) {
//                System.out.print(para.getName()+" ");
//
//            }
//            System.out.println();
//        }

    }


}
