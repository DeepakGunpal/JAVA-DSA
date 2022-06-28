package com.deepak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Namaste Deepak");
        Scanner input = new Scanner(System.in);
//        input.next();
//        System.out.println(input.nextLine());
        System.out.print("Enter temp in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}