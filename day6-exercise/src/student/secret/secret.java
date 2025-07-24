package student.secret;

import java.util.Scanner;

public class secret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your password");
        int a = sc.nextInt();
        String b = transfer(a);
        System.out.println(b);
    }
    public static String transfer(int n){
        int[] arr = split(n);
        String newcode="";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        arr = reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            newcode += arr[i];
        }
        return newcode;
    }

    public static int[] reverse(int[] arr) {
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] split(int n) {
        int[] arr = new int[4];
        arr[0] = n / 1000;
        arr[1] = (n / 100) % 10;
        arr[2] = (n / 10) % 10;
        arr[3] = n % 10;
        return arr;

    }
}
