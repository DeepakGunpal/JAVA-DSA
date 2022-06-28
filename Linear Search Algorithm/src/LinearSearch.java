import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println(name.charAt(0));
        //get particular element of string with index
        System.out.println(Arrays.toString(name.toCharArray()));
        // convert string to array
        char target = 'o';
        System.out.println(search(name,target));
    }

     static boolean search(String str,char target) {
        if(str.length()==0){
            return false;
        }

        //for loop
//         for (int i = 0; i < str.length(); i++) {
//             if (target == str.charAt(i)) {
//                 return true;
//             }
//         }
         
         //for each
         for (char ch:
         str.toCharArray()){
             if (ch == target) {
                 return true;
             }
         }
         return false;
    }
}

