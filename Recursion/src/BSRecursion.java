import java.util.Scanner;

public class BSRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,3,5,6,48,56,69,78,88,99};
        int target = in.nextInt();
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if (s>e) return -1;
        int m = s + (e-s) / 2;

        if (arr[m]==target) return m;
        if (target<arr[m]) {
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }
}
