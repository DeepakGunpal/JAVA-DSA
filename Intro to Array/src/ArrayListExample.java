import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(55);
        list.add(56);
        list.add(889);
        list.add(35);
        list.add(43);
        list.add(6748);
        System.out.println(list.contains(43));//true
        System.out.println(list);//[55, 56, 889, 35, 43, 6748]
        list.set(0,99);//update element
        list.remove(2);//remove element
        System.out.println(list);//[99, 56, 35, 43, 6748]

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
            //pass index here, list[index] syntax will not work here
        }
    }
}

