import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {-45,-26,-15,-8,-3,4,8,14,28,45,68,99};
        int target =  in.nextInt();
        int ans  = floor(arr,target);
        System.out.println(ans);
    }
    //return the index of greatest no. <= target
    // return -1 if it does not exist
    static int floor(int[] arr, int target){

        //
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            //find the middle element
//            int mid = (start+end)/2;// might be possible that (start + end) exceeds the range of integer
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
        return end;
    }

}
