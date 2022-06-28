//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,849526};
//        System.out.println(findNumbers(nums));
        System.out.println(digits2(-0));
    }

    static int findNumbers(int[] nums) {
        int count =0;
        for (int num :
                nums) {
            if (even(num) ) {
                count++;
            }
        }

        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    //optimized way to get number of digits
    static int digits2(int num){// num = 789456
        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)+1); //output = 6
    }

    //count number of digits in a number
    static int digits(int num){
        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;

        while (num>0){
            count++;
            num /= 10;
        }
        return count;
    }

}
