public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7;
        System.out.println(rotatedBS(arr,target,0,arr.length-1));
    }

    private static int rotatedBS(int[] arr, int target, int s,int e) {
        if (s>e) return -1;
        int m = s + (e -s)/2;
        if (arr[m]==target) return m;

        if (arr[s]<=arr[m]){
            if (target>=arr[s] && target <= arr[m]){
                return rotatedBS(arr, target,s,m-1);
            }else {
                return rotatedBS(arr,target,m+1,e);
            }
        }

        if (target>= arr[m] && target <= arr[e]){
            return rotatedBS(arr,target,m+1,e);
        }
        return rotatedBS(arr, target,s,m-1);
    }
}
