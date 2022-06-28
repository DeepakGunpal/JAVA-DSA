package com.deepak;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //find the number of times a occurred in n
        System.out.println("Enter n: ");
        int n = in.nextInt();

        int reverse = 0;

        while(n>0){
            int rem = n%10;
            n /= 10;
                reverse = reverse*10 + rem;
        }
        System.out.println(reverse);

    }
}
