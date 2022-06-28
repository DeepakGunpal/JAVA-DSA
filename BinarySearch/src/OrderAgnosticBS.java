import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
            // ascending
//        int[] arr = {-45,-26,-15,-8,-3,4,8,14,28,45,68,99};
        //descending
        int[] arr = {99,84,61,54,49,23,22,5,-14,-15,-56,-94};
        int target =  in.nextInt();
        int ans  = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

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
}
