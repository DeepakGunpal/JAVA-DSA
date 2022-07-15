public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,12,45};
        int i = 0;
        System.out.println(sorted(arr,i));
    }

    //check whether array is sorted or not
    static boolean sorted(int[] arr, int i){
        if (i+1==arr.length) return true;
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
}