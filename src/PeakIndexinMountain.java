import java.util.Scanner;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexinMountain {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(PeakIndex(arr));
    }

    static int PeakIndex(int[] nums){


        int start = 0;
        int end = nums.length-1;

        while (start<end){
            //find the middle element
//            int mid = (start+end)/2;// might be possible that (start + end) exceeds the range of integer
            int mid = start + (end-start)/2;

            if (nums[mid] > nums[mid+1]) {
                //you are in decreasing part of array
                //this may be the answer, but look at left
                //this is why end != mid-1
                end = mid;
            } else {
                //you are in ascending part of array
                //since we know that mid+1 element > mid element hence we ignoring mid
                start = mid+1;
            }
        }
        return start;//can return end also as both are equal
    }
}
