package student.algorithm;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1};
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
