package student.algorithm;

public class Test3 {
    public static void main(String[] args) {
        int[]  arr={7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr, 127));
    }


    public static int binarySearch(int[] arr,int value){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==value){
                return mid;
            }
            else if(arr[mid]>value){
                right=mid-1;
            }
            else if(arr[mid]<value){
                left=mid+1;
            }
        }
        return -1;
    }
}

