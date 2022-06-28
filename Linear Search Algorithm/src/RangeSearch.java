import java.util.Scanner;

public class RangeSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {23,45,65,98,56,21,69,2,6,485,32};
        int target = in.nextInt();
        int start = in.nextInt();
        int end = in.nextInt();
       int ans = SearchInRange(nums, target, start, end);
        System.out.println(ans);
    }

    static int SearchInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }

        //for loop
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
