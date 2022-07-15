import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,1,5};
//        System.out.println(find(arr,4,0));
//        System.out.println(findIndex(arr,4,0));
//        System.out.println(findIndexLast(arr,4,arr.length-1));
//        findAllIndex(arr,4,0);
//        System.out.println(list);
//        System.out.println(arrayListOfAllIndex(arr,4,0,new ArrayList<>()));
        System.out.println(arrayListOfAllIndex(arr,4,0 ));
    }

    static boolean find(int[] arr, int target, int i){
        if (i == arr.length) return false;
        return arr[i] == target || find(arr,target,i+1);
    }

    static int findIndex(int[] arr, int target, int i){
        if (i == arr.length) return -1;
        if (arr[i] == target) return i;
        return findIndex(arr,target,i+1);
    }

    static int findIndexLast(int[] arr, int target, int i){
        if (i == -1) return -1;
        if (arr[i] == target) return i;
        return findIndexLast(arr,target,i-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int i){
        if (i == arr.length) return;
        if (arr[i] == target) list.add(i);
        findAllIndex(arr,target,i+1);
    }

    //return array list
    static ArrayList arrayListOfAllIndex(int[] arr, int target, int i,ArrayList<Integer> list2 ){
        if (i == arr.length) return list2;
        if (arr[i] == target) list2.add(i);
        return arrayListOfAllIndex(arr,target,i+1,list2 );
    }

    //return the list without passing the argument
    static ArrayList arrayListOfAllIndex(int[] arr, int target, int i){
        ArrayList<Integer> list2 = new ArrayList<>();
        if (i == arr.length) return list2;
        if (arr[i] == target) list2.add(i);
        ArrayList<Integer> ans = arrayListOfAllIndex(arr,target,i+1 );
        list2.addAll(ans);
        return list2;
    }
}
