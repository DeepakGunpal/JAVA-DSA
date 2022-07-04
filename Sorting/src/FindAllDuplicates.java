import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){

            int correct = nums[i]-1;
            if (correct<nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }


        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1) ans.add(nums[j]);
        }
        return ans;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
