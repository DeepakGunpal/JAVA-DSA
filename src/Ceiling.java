import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {-45,-26,-15,-8,-3,4,8,14,28,45,68,99};
        int target =  in.nextInt();
        int ans  = ceiling(arr,target);
        System.out.println(ans);
    }
    //return the index of smallest no. >= target
    // return -1 if it does not exist
    static int ceiling(int[] nums, int target){

        //if the target is greater than the greatest number in the array
        if (target > nums[nums.length-1]) {
            return -1;
        }
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
                //ans found
                return mid;
            }
        }
        return start;
    }

}