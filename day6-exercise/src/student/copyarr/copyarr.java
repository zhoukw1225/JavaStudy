package student.copyarr;

public class copyarr {
    public static void main(String[] args) {
        int[] arr = new int[] {11,22,33};
        int[] newarr = copy(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }

    }
    public static int[] copy(int[] arr){
        int[] arrnew = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrnew[i]=arr[i];
        }
        return arrnew;
    }
}
