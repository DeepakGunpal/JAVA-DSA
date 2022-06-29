import java.util.Scanner;

public class FindPeakHard {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(search(array,target));
    }

    static  int search(int[] arr, int target){
        int peak = PeakIndex(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){


        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            //find the middle element
//            int mid = (start+end)/2;
// might be possible that (start + end) exceeds the range of integer
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

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
