import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
//        //swap
        int[] arr = {1,3,32,56,84,99};
//        swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));//[1, 56, 32, 3, 84]

        //max element
//        int[] arr1 = {1,3,32,56,84,12,47};
//        System.out.println(max(arr1));
//        System.out.println(maxRange(arr1,1,3));
        reverse(arr);
        System.out.println(Arrays.toString(arr));//[99, 84, 56, 32, 3, 1]


    }

    //swap
    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i1];
        arr[i1] = arr[i];
        arr[i] = temp;
    }

    //max
    static int max(int[] arr1){
        //if empty array
        if (arr1.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return  max;
    }

    //maxNum from range
    static int maxRange(int[] arr1, int start, int end){

        if (end > start) {
            return -1;
        }

        if (arr1 == null) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return  max;
    }

    //reverse an array
    static int reverse(int[] arr){
    int start = 0;
    int end = arr.length-1;
       while (start<end){
           swap(arr,start,end);
           start++;
           end--;
       }

        return start;
    }



}
