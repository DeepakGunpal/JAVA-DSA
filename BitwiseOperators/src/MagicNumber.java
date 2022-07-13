public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;
        while (n>0){
            int last = n&1;
            n = n>>1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
    //its TC will be the number of digits in binary of n
}
