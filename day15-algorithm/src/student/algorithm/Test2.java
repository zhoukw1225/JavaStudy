package student.algorithm;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1};
        for (int i = 0; i < arr.length-1; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
        if (i != minindex) {
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }


        }
        System.out.println(Arrays.toString(arr));
    }
}
