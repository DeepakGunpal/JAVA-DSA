public class FindIthBit {
    public static void main(String[] args) {

        int n = 182;//10110110
        int n1 = 86;//10111110
        System.out.println(findIthBit(n,6));
        System.out.println(setIthBit(n,4));
        System.out.println(resetIthBit(n1,5));

    }

    private static int resetIthBit(int n, int i) {
        return n^(1<<(i-1));
    }


    static int findIthBit(int n, int i){
        return (n&(1<<(i-1)))>>(i-1);
    }

    static int setIthBit(int n, int i){
        return n|(1<<(i-1));
    }


}
