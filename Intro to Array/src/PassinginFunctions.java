import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3,2,5,8,9,4};
        System.out.println(Arrays.toString(nums));
        //[3, 2, 5, 8, 9, 4]
        change(nums);
        System.out.println(Arrays.toString(nums));
        //[30, 2, 5, 8, 9, 4] because of mutable behaviour
    }

    private static void change(int[] arr) {
        arr[0]= 30;
    }
}
