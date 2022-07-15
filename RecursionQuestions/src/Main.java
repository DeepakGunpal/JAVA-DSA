public class Main {
    public static void main(String[] args) {
//       fun(5);
//        System.out.println();
//       funRev(5);
//        System.out.println( factorial(5));
//        System.out.println( sum(10));
//        System.out.println( sumOfDigits(4321));
//        System.out.println( productOfDigits(4321));
    }

    //print n to 1;
    private static void fun(int n) {
        if (n==0) return;
        System.out.print(n);
//        fun(n-1);
        fun(--n);
//        fun(n--);//stack over flow
    }

//    print 1 to n;
    private static void funRev(int n) {
        if (n==0) return;
        funRev(n-1);
        System.out.print(n);
    }

    //factorial
    private static long factorial(long n) {
        if (n==1) return 1;
        return n * factorial(n-1);
    }

    //sum
    private static int sum(int n) {
        if (n==1) return 1;
        return n + sum(n-1);
    }

    //sum of digits
    private static int sumOfDigits(int n){
        if (n<=1) return n;
        return n%10 + sumOfDigits(n/10);
    }

    //Product of digits
    private static int productOfDigits(int n){
        if (n%10 == n) return n;
        return n%10 * productOfDigits(n/10);
    }


}