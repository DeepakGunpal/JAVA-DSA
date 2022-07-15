public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(304000504));
    }

    static int countZeroes(int n){
        return helper(n,0);
    }

    private static int helper(int n,int count) {
        if (n<=0) return count;
        if (n%10 == 0) return helper(n/10,count+1);
        return helper(n/10,count);
    }
}
