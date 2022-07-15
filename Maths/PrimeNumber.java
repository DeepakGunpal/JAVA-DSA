public class PrimeNumber {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 0; i <= n; i++) { //O(n)
            if (isPrime(i)){
            System.out.println(i);
            }
        }
//        for (int i = 0; i <= n; i++) {
//                System.out.println(i + " " + isPrime(i));
//        }
    }

    private static boolean isPrime(int n) { //O(sqrt(n))
        if (n<=1) return false;
        int c = 2;
        while (c*c <= n){
            if (n%c==0) return false;
            c++;
        }
        return true;
    }
}
