import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {23,4,1},
                {18,102,3,9},
                {56,89,12,47},
                {98,16}
        };
        int target = in.nextInt();
        int[] ans = search(arr,target);//format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    //find element in 2D Array
    private static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //find max element in 2D Array
    static int max(int[][] arr){
//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;

    }
}
