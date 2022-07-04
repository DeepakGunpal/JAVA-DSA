public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(4);
//        pattern6(4);
//        pattern7(4);
//        pattern10(4);
//        pattern17(4);
//        pattern28(4);
//        pattern30(4);
        pattern31(4);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {

            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

//    static void pattern3(int n){
//        for (int row = n; row >= 1; row--) {
//            //for every row, run the col
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            //when one row is printed, we need to add a newline
//            System.out.println();
//        }
//    }

    //or

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

//    //my solution
//    static void pattern5(int n){
//        for (int row = 1; row <= 2*n-1; row++) {
////            boolean c = row<=n;
//            if (row<n) {
//                //for every row, run the col
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            }else{
//                for (int col = 1; col < 2*n-row+1; col++) {
//                    System.out.print("* ");
//                }
//            }
//            //when one row is printed, we need to add a newline
//            System.out.println();
//        }
//    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row>n?2*n-row:row;
            //for every row, run the col
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n-row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 0; row <= n; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print("  ");
            }
            //for every row, run the col
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n-row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row < 2* n; row++) {

            int c = row>n ? 2*n-row : row;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row = 1; row < 2* n; row++) {
//            int noOfSpaces = row>n?row-n:n-row;
            int noOfSpaces = row>n?row-n:n-row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            int totalColsInRow = row>n?2*n-row:row;
            //for every row, run the col
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    //my incomplete solution
//    static void pattern30(int n){
//        for (int row = 1; row <= n; row++) {
//            int noOfSpaces = n-row;
//            for (int i = 0; i < noOfSpaces; i++) {
//                System.out.print("  ");
//            }
//
//            for (int col = 1; col <= 2*row-1; col++) {
//                int colElem = col>=2*row?col-row:row-col+1;
//                System.out.print(colElem+" ");
//            }
//            //when one row is printed, we need to add a newline
//            System.out.println();
//        }
//    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern31(int n){
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {

                int atEveryIndex = (n/2)-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}