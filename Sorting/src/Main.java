import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {5,4,3,2,1};
        int[] arr = {2,-5,26,-59,26,-16,59,26,0,1};
        bubble(arr);
//        selection(arr);
//        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    //selection sort
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array
            // and swap with correct index
            int last = arr.length - 1 -i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    
    static void swap(int[] arr,int first,int second){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    //bubble sort
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if no swap for a particular value of i,
            // it means the array is sorted. hence stop the program
            if (!swapped) break;
        }
    }
}


