import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        int[][] array = new int[3][];
        //no. of rows will be 3
        //no. of columns is not necessary to define
        //but adding number no. of roms in mandatory

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr1 = {
                {1, 2, 3}, //0th index
                {4, 5},//1st index
                {6, 7, 8, 9}//2nd index
        };

        int[][] arr2 = new int[3][3];
        System.out.println(arr2.length);// no of rows

        //input
        for (int row = 0; row < arr2.length; row++) {
            // for each col in every row
            for (int col = 0; col <arr2[row].length; col++) {
                arr2[row][col] = in.nextInt();
            }
        }

        //output
        //1
        for (int row = 0; row < arr2.length; row++) {
            // for each col in every row
            for (int col = 0; col <arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");;
            }
            System.out.println();
        }

        //2
        System.out.println(Arrays.deepToString(arr2));

        //3
        //for loop
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }

        //4
        //enhanced for loop
        for (int[] ints : arr2) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
