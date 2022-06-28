import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,3,2,56,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
        //output => [99, 3, 2, 56, 8]
    }

    private static void change(int[] nums) {
        nums[0] = 99;
//        if you make a change to the object via this reference variable, same object will be changed
    }
}
