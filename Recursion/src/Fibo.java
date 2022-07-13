public class Fibo {
    public static void main(String[] args) {
//        System.out.println(fibo(6));
        for (int i = 0; i < 11; i++) {
        System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n){
        //use long, int size might exceed
        return (int)( ( Math.pow((1+Math.sqrt(5))/2,n)  - Math.pow((1-Math.sqrt(5))/2,n) )/Math.sqrt(5) );
//        return (int)( Math.pow((1+Math.sqrt(5))/2,n)  /Math.sqrt(5) );
    }

    static int fibo(int n){

        //base condition
//        if (n==0) return 0;
//        if (n==1) return 1;
//        or
            if (n<2) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
