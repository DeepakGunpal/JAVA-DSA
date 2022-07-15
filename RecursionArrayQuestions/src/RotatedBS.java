import java.util.Arrays;

public class RotatedBS {
    public static void main(String[] args) {
//        int[] arr = {5,6,7,8,9,1,2,3};
//        int target = 5;
//        System.out.println(rotatedBS(arr,target,0,arr.length-1));
        //leet code question
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
//        System.out.println(Arrays.toString(rotate(arr, k)));
        System.out.println(Arrays.toString(rotateBetter(arr, k)));
    }

    //leetcode - https://leetcode.com/problems/rotate-array/
        static int[] rotate(int[] nums, int k) {
            if(k>nums.length) k %= nums.length;
            if (k==nums.length) return nums;
            int[] arr = new int[nums.length];
            if (k>nums.length/2) {
                for (int i = 0; i < k; i++) {
                    arr[i] = nums[i];
                    nums[i] = nums[nums.length - k + i];
                }

                for (int i = k; i < nums.length; i++) {
                    nums[i] = arr[i - k];
                }
            }else {
                for (int i = nums.length-1; i >= k; i--) {
                    arr[i] = nums[i];
                    nums[i] = nums[i - k];
                }

                for (int i = 0; i < k; i++) {
                    nums[i] = arr[arr.length - k + i];
                }
            }
            return nums;
        }

        //better approach
    static int[] rotateBetter(int[] nums, int k) {
        if(k>nums.length) k %= nums.length;
        if(k==nums.length) return nums;
        int[] arr = new int[nums.length];
        for(int i=k; i<nums.length; i++){
            arr[i] = nums[i-k];
        }
        for(int i=0; i<k; i++){
            arr[i] = nums[nums.length-k+i];
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
        return nums;
    }

        //rotated binary search
    private static int rotatedBS(int[] arr, int target, int s,int e) {
        if (s>e) return -1;
        int m = s + (e -s)/2;
        if (arr[m]==target) return m;

        if (arr[s]<=arr[m]){
            if (target>=arr[s] && target <= arr[m]){
                return rotatedBS(arr, target,s,m-1);
            }else {
                return rotatedBS(arr,target,m+1,e);
            }
        }

        if (target>= arr[m] && target <= arr[e]){
            return rotatedBS(arr,target,m+1,e);
        }
        return rotatedBS(arr, target,s,m-1);
    }
}
