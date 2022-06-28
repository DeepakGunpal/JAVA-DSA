public class Greeting {
    public static void main(String[] args) {
//        String message = greeting();
//        System.out.println(message);
    String personalised = myGreet("India");
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String msg = "Namaste " + name;
        return msg;
    }


    static String greeting(){
        String greeting = "Deepak gunpal";
        return greeting;
    }
}
