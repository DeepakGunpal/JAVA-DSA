public class FindOddOccurrence {
    public static void main(String[] args) {
            int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(findOddOccurrence(arr));
    }


    //incomplete not working
    private static int findOddOccurrence(int[] arr) {
        int sum = 0;
        for (int elem:
             arr) {
            sum += countSetBit(elem);
        }

        return sum;
    }

    static int countSetBit(int num) {
        int count = 0;
        while (num>0){
            num &= (num-1);
            count++;
        }
        return count;
    }
}
