import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'a');//194
        System.out.println('a'+'b');//195
        System.out.println("a"+"b");//ab
        System.out.println("a"+'b');//ab
        System.out.println("a"+1);//a1
        //integer will be converted to Integer that will call toString()
        //"a"+"1"
        System.out.println('a'+3);//100
        System.out.println((char) ('a'+3));//d
        System.out.println("Deepak"+ new ArrayList<>());//Deepak[]
        System.out.println("Deepak"+ new Integer(24));//Deepak24
//        System.out.println(new ArrayList<>()+ new Integer(24));//error
        //because atleast one of the object should be of type String
        System.out.println(new ArrayList<>()+""+ new Integer(24));//[]24
    }
}
