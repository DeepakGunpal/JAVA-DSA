import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }

    //search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
             if (matrix[row][mid]<target){
                    cStart = mid +1;
            }else {
                 cEnd = mid-1;
             }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        if (rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols/2;

        //run the loop till two loop are remaining
        while (rStart<(rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;
            if (matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid]<target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }

        //now we have two rows
        //check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        return new int[]{};
    }
}
