import java.util.Scanner;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class RotatedSAwithDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //rotated sorted array
//        int[] arr = {4,5,6,7,7,7,8,9,0,1,2,3};
        int[] arr = {4,4,4,4,4,4,4,4,3,4,};
        //sorted array but not rotated
//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int target = in.nextInt();
        System.out.println(search(arr,target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        //if pivot is not found that means the array is not rotated
        if (pivot == -1) {
            //normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        //if pivot found, that means you have 2 asc order sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarySearch(int[] arr,int target,int start, int end){

        while (start<=end){
            //find the middle element
            //  int mid = (start+end)/2;
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //Note: what if these element at start and end were the pivots
                //check if start is pivot
                if(start < end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (end > start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is  sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start]==arr[mid]&& arr[mid]>arr[end])) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
