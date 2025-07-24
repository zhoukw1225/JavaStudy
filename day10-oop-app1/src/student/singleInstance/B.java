package student.singleInstance;

public class B {
    private B(){}

    private static B b;

    public static B getObject(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}
