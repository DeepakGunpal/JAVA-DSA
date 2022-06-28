public class Overloading {
    public static void main(String[] args) {
        fun(67);//67
        fun("Deepak");//Deepak
        fun(67,56);//123
    }

    private static void fun(int b, int c) {
        System.out.println(b+c);
    }

    private static void fun(String name) {
        System.out.println(name);
    }

    private static void fun(int a) {
        System.out.println(a);
    }
}
