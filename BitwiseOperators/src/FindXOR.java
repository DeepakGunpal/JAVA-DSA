public class FindXOR {
    public static void main(String[] args) {
        //XOR of all nos between a & b
    /*
    XOR of all number form 0 to b
    again XOR with 0 to a-1
     */

        int a = 3;
        int b = 9;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }

    //find XOR of all numbers from 0 to a
    /*
    a%4 = 0 => a
    a%4 = 1 => 1
    a%4 = 2 => a+1
    a%4 = 3 => 0
     */

    static int xor(int a){
        if (a%4 == 0) return a;
        if (a%4 == 1) return 1;
        if (a%4 == 2) return a+1;
       return 0; // when a%4 == 3
    }

}
