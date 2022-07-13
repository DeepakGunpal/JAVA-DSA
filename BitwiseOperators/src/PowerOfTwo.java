public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(PowerOfTwo(n));
    }
    static boolean PowerOfTwo(int n){
        if (n==0) return false;
        return (n&(n-1))==0;
    }
}
