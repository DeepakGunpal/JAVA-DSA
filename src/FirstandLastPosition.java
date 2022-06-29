import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstandLastPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int[] nums = {5,7,7,8,8,8,8,8,10};
       int target = in.nextInt();
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        //check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
        ans[1] = search(nums, target, false);
        }
        return ans;
    }

    //this function just returns the index values of target
    static int search(int[] nums, int target, boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            //find the middle element
//            int mid = (start+end)/2;// might be possible that (start + end) exceeds the range of integer
            int mid = start + (end-start)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                //potential ans found
                ans =  mid;
                if (findStartIndex) {
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }
        }
        return ans;
    }
}
