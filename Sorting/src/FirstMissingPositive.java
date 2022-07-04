import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] nums = {4,3,-1,1};
        int[] nums = {7,8,9,5,3};
        System.out.println(firstMissingPositive(nums));
        System.out.println(Arrays.toString(nums));
    }
    static int firstMissingPositive(int[] arr){
        //cycle sort
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }

        //search for missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1) return j+1;
        }
        return arr.length+1;
    }


    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
