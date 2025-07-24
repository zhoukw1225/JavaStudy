package student.method.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] array ={11,22,33,44,55};
        printarray(array);
    }

    public static void printarray(int[] arr){
        if (arr == null){
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if (i != arr.length-1) {
                System.out.print(arr[i]+",");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}
