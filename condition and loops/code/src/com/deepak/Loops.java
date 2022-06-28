package com.deepak;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
                 Syntax of for loops:
                 for (initialisation; condition; increment/decrement){
                 //body
                 }

         */
//        //Q: Print numbers from 1 to 5
//        for (int num = 0; num <= 5; num++) {
//            System.out.println(num);
//        }

        //print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        for (int i = 1; i <=n; i++) {
//            System.out.print(i + ", ");
//        }

        //while loops
        /*
        Syntax:
        while(condition){
        //body
        }
         */
            int i = 1;
            while (i<=n){
                System.out.println(i);
                i++;
            }
    }
}
