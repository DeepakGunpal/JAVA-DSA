public class RotationCount {
    public static void main(String[] args) {
//        int[] arr = {5,6,7,8,9,0,1,2,3,4};
//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr = {4,4,4,4,4,4,4,4,3,4,};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        return findPivot(arr) + 1;
    }

    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //Note: what if these element at start and end were the pivots
                //check if start is pivot
                if(start < end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (end > start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is  sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start]==arr[mid]&& arr[mid]>arr[end])) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
