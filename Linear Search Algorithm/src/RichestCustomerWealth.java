public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
    }
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int rowSum = 0;
            for (int anInt : ints) {
                rowSum += anInt;
            }
            if (rowSum > maxWealth) {
                maxWealth = rowSum;
            }
        }
        return maxWealth;
    }
}
