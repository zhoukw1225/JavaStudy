package student.q3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q3 {
    public static void main(String[] args) {
        try (
                BufferedReader bf = new  BufferedReader(new FileReader("day22-final\\src\\student\\q3\\系统菜单.txt"));
                PrintStream ps = new PrintStream("day22-final\\src\\student\\q3\\系统菜单(修正).txt")
                ){
            List<String> menu = new ArrayList<>();
            String line;
            while ((line = bf.readLine()) != null) {
                menu.add(line);
            }
            Collections.sort(menu);
            for (String str : menu) {
                String[] list = str.split("-");
                System.out.println(list[0].length() == 4 ? list[1] : "\t"+list[1]);
            }

            for (String s : menu) {
                ps.println(s);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
