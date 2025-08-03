package student.innerClass;

public class Test {
    public static void main(String[] args) {
        Outer o1  = new Outer();
        Outer o2  = new Outer();
        Outer.Inner i1 = new Outer.Inner();
        Outer.Inner i2 = new Outer.Inner();
        o1.setAge(1);
        o2.setAge(2);
        System.out.println(o1.getAge());
        System.out.println(o2.getAge());
        i1.setName("qq");
        i2.setName("www");
        System.out.println(i1.getName());
        System.out.println(i2.getName());
    }
}
