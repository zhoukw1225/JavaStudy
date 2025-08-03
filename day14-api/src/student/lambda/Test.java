package student.lambda;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            public void eat(){
                System.out.println("狗吃吃吃");
            }
        };
        a.eat();
//    Swimming s = new Swimming(){
//        @Override
//        public void swim(){
//            System.out.println("游啊游");
//        }
//    };

        Swimming s2 = () -> {
            System.out.println("游啊游");
        };

        s2.swim();
    }


}

interface Swimming{
    void swim();
}

abstract class Animal{
    public abstract void eat();
}