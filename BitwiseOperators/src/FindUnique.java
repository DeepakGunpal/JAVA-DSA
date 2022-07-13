import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
//        int[] arr = {2,3,3,4,2,6,4,5};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int num: arr){
            unique ^= num;
        }

        return unique;
    }
}
