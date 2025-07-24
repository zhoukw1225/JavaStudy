package student.d3;

public class Student {
    static int score;
    String name;

    static{
        score = 0;
        System.out.println("静态代码块执行了");
    }

    {
        System.out.println("实例代码块执行");
    }

    public Student(){
        System.out.println("无参构造器执行了");
    }
    public Student(String name){
        this.name=name;
        System.out.println("有参构造器执行了");
    }

    public static void printHello() {
        System.out.println("hello" + score);
//        System.out.println("hello" +name);

    }

    public void printPass() {
        System.out.println("pass" + score);
        System.out.println("hello" + name);
    }
}
