import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Deepak Gunpal";
        System.out.println(Arrays.toString(name.toCharArray()));
        //[D, e, e, p, a, k,  , G, u, n, p, a, l]
        System.out.println(name.toLowerCase());
        //deepak gunpal
        System.out.println(name);
        //Deepak Gunpal
        System.out.println(name.indexOf('a'));//4
        System.out.println("   Deepak   ".strip());//remove extra space
        System.out.println(Arrays.toString(name.split(" ")));
        //[Deepak, Gunpal]
    }
}
