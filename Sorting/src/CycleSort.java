import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
//        int[] arr = {4,5,2,1,0};
//        int[] arr = {3,4,-1,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int missingNum = missingNum(arr);
        System.out.println(missingNum);
    }

    //https://leetcode.com/problems/missing-number/
    //find missing number
    static int missingNum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i) return i;
        }
        return arr.length;
    }

    //cycle sort
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            //if range is from 1 to n
//            int correct = arr[i]-1;
            //if range is from 0 to n
            int correct = arr[i];
            if (correct<arr.length && arr[i] != arr[correct]){
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
