public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);// swaped
        swap(a,b);
        System.out.println(a + " " + b);// not swaped

        String name = "Deepak gunpal";
        changeName(name);
        System.out.println(name);
        // not swaped => because in java we dont have pass by reference
        // its only pass by value
    }

    private static void changeName(String name) {
        name = "Sanjay gunpal";// creating a new object
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
