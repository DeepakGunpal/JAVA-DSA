package com.deepak;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //find the number of times a occurred in n
        System.out.println("Enter n and a: ");
        int n = in.nextInt();
        int a = in.nextInt();
        int count = 0;

        while(n>0){
            int rem = n%10;
            if (rem == a) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
