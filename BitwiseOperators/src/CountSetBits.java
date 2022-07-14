import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(countSetBits(num));
        System.out.println(countSetBit(num));

    }

    //simple approach with TC O(logn) and SC O(1)
    private static int countSetBits(int num) {
        int count = 0;
        while (num>0){
            count += num&1;
            num >>= 1;
        }

        return count;
    }

    //effective Observation
    //upon subtracting 1 from any integer, we observe:
    // => the rightmost set bit becomes unset, and
    // => all the bits on the right of the rightmost set bit are flipped

    //Brian Kernighan's algorithm
    //TC O(logn) SC O(1)
    private static int countSetBit(int num) {
        int count = 0;
        while (num>0){
            num &= (num-1);
            count++;
        }
        return count;
    }

}
