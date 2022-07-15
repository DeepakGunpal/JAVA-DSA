public class Reverse {
    //way-1
    //reverse a number 1824 => 4281
    static int sum = 0;
    static void reverseNumber(int n){
        if (n<=0) return;
//        int rem = n%10;
        sum = sum * 10 + n%10;
        reverseNumber(n/10);
    }

    //way-2
    static int reverseNumber2(int n){
        //sometimes you might need some additional variables in the argument
        //in that case, make another function
        int digits = (int)(Math.log10(n)+1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) return n;
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        reverseNumber(1824);
        System.out.println(sum);
        System.out.println(reverseNumber2(1234));
    }
}
