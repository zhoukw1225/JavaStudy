package student.arraylist;

import java.util.ArrayList;

public class shopcar {
    public static void main(String[] args) {
        ArrayList<String> shoppingcar = new ArrayList<>();
        shoppingcar.add("Java");
        shoppingcar.add("枸杞1号");
        shoppingcar.add("枸杞2号");
        shoppingcar.add("枸杞3号");
        shoppingcar.add("枸杞4号");

        for (int i = 0; i < shoppingcar.size(); i++) {
            if (shoppingcar.get(i).contains("枸杞")) {
                shoppingcar.remove(i);
                i--;
            }

        }
        System.out.println(shoppingcar);
    }
}
