package com.deepak;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q: find the largest of the 3 numbers
//        int max = a;
//        if (max<b) {
//            max = b;
//        }
//        if (max <c) {
//            max = c;
//        }

        int max = Math.max(Math.max(a,b),c);
        System.out.println(max);
    }
}
