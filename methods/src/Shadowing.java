public class Shadowing {
    static int x = 90;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
//        int x = 50;// the class variable at line 4 is shadowed by this
        int x;
//        System.out.println(x);// this will give error;
        // shadowing will begin when variable is initialized;
        x=40;
        System.out.println(x);//50
        fun();//90 this will be 90 because we can't access variable outside the function
    }

    private static void fun() {
        System.out.println(x);
    }
}
