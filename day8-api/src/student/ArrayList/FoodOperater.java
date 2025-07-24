package student.ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类，负责上架以及操作菜品
 */
public class FoodOperater {
    private ArrayList<Food> foodList =new ArrayList<>();

    public void addFood(){
        Food f = new Food();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入菜品名称");
        f.setName(sc.next());
        System.out.println("输入菜品价格");
        f.setPrice(sc.nextDouble());
        System.out.println("输入菜品描述");
        f.setDesc(sc.next());

        foodList.add(f);
        System.out.println("上架成功");
    }
    
    
    public void showAllFoods(){
        if (foodList.isEmpty()){
            System.out.println("还未添加菜品");
            return;
        }

        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("----------------------------");

        }
    }



/** 负责展示菜品界面 */
    public void start(){
        while (true) {
            System.out.println("请选择功能");
            System.out.println("1.上架菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出");

            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("输入的命令不存在");
                    break;

            }
        }
    }
}
