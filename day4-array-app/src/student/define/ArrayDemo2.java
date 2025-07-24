package student.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {12,66,16};
        System.out.println(arr[0]);
        arr[1]= 18;
        System.out.println(arr[1]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
