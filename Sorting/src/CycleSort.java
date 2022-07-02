import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
//        int[] arr = {5,4,3,2,1};
        int[] arr = {5,4,3,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            //if range is from 1 to n
//            int correct = arr[i]-1;
            //if range is from 0 to n
            int correct = arr[i];
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
