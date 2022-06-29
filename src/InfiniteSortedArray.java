import java.util.Scanner;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 180, 190, 200, 210, 220,230,240};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(findRange(arr,target));
    }

    static int findRange(int[] arr, int target){
        //find the range
        //find start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end+1;
            //double the box value
            //end = previous end + sizeofbox*2
            end = end + (end-start+1) * 2;
            start = newStart;
        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int[] nums, int target,int start, int end){

        while (start<=end){
            //find the middle element
//            int mid = (start+end)/2;// might be possible that (start + end) exceeds the range of integer
            int mid = start + (end-start)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
