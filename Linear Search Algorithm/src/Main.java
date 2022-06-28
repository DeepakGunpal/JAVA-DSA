import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {23,45,65,98,56,21,69,2,6,485,32};
        int target = in.nextInt();
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        //for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
//                return i;
                return i;
            }
        }
        //
        return -1;
//        return Integer.MAX_VALUE;
    }
}