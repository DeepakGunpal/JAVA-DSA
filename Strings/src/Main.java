public class Main {
    public static void main(String[] args) {
        String a = "Deepak";
        String b = "Deepak";
        System.out.println(a==b);

        String name1 = new String("Deepak");
        String name2 = new String("Deepak");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

    }
}