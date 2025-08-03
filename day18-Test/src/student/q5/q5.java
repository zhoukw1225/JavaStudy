package student.q5;

public class q5 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;

        System.out.println(searchLeft(nums, target));
    }

    public static int searchLeft(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int rs = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            }else if (nums[mid] < target) {
                start = mid + 1;
            }else{
                rs = mid;
                end = mid - 1;
            }
        }
        return rs;
    }
}
