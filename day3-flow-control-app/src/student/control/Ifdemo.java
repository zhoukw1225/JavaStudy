package student.control;

public class Ifdemo {
    public static void main(String[] args) {
        double t = 38.6;
        if (t>36){
            System.out.println("温度过高！！！");
        }


        double money = 100.0;
        if (money > 90){
            System.out.println("send successfully");

        }else{
            System.out.println("send error");
        }



        double score = 120;
        if (score >= 90){
            System.out.println("tier A");
        }else if (80 <= score && score < 90){
            System.out.println("tier B");
        }else if (60 <= score && score < 80){
            System.out.println("tier C");
        }else if (0 <= score && score < 60){
            System.out.println("tier D");
        }else {
            System.out.println("error input");
        }
    }
}
