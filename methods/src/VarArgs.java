import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,56,65,89,1,23,44); //array of args
        fun();// [] empty array
        multiple(2,5,"Deepak");
    }

    private static void multiple(int i, int i1, String ...v) {
        System.out.println();
    }

    private static void fun( int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
