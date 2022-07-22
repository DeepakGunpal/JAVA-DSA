public class FindOddOccurrence {
    public static void main(String[] args) {
            int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(findOddOccurrence(arr));
    }


    private static int findOddOccurrence(int[] arr) {
        //sum of total set bits
        int sum = 0;
        for (int elem:
             arr) {
            sum += Integer.parseInt(Integer.toBinaryString(elem));
        }
        //binary answer
        int binaryans = 0;
        while(sum>0){
            binaryans = (binaryans*10+(sum%10)%3)^1;
            sum /= 10;
        }

        //convert binary to decimal
        int finalans = 0;
        int i = 0;
        while (binaryans>0){
            finalans += binaryans%10 * (int)(Math.pow(2,i));
            binaryans /= 10;
            i++;
        }
        return finalans;
    }

}
