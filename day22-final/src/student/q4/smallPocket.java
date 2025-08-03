package student.q4;

import java.util.Random;

public class smallPocket extends pocket {
    private int money;
    private String name;

    Random rand = new Random();

    public smallPocket(int number) {
        this.money = rand.nextInt(1, 31);
        this.name = "小红包" + number + "号";
    }

    @Override
    public String toString() {
        return "smallPocket{" +
                "money=" + money +
                ", name=" + name +
                '}';
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

