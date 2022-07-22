package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        sort(arr,0,arr.length-1);
        Arrays.sort(arr);//internal algorithm
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high){
        if (low>=high) return;

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while (s <= e){
            //i.e. why if its already sorted it will not swap
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }
            if (s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        //now pivot is at correct index, sort two halves now
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
