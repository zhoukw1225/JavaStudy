package student.control;

public class Switchdemo {
    public static void main(String[] args) {
         String day ="周三";
         switch(day){
             case "周一":
                 System.out.println("周一呜呜");
                 break;
             case "周二":
                 System.out.println("周二呜呜");
                 break;
             case "周三":
                 System.out.println("周三呜呜");
                 break;
             default:
                 System.out.println("输入的错误");

         }
    }
}
