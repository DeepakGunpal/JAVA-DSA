public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumTillNth(n));
        System.out.println(sumOfNth(n));
    }

    //Sum of all elements up to Nth row in a Pascal triangle
    private static int sumTillNth(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (1<<i);
        }
        return sum;
    }

    //Sum of all elements of Nth row in a Pascal triangle
    private static int sumOfNth(int n) {
        return (1<<(n-1));
    }
}
