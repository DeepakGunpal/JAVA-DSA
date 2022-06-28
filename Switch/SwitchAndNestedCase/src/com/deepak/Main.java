package com.deepak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        if (fruit.equals("mango")) {
//            System.out.println("King of Mango");
//        }

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("Sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("round fruit");
//                break;
//            case "Grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");


//        //enhanced switch
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Sweet red fruit");
//            case "Orange" -> System.out.println("round fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }

        //print days in week
        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        switch (day){
//            case 1:
//            case 2:
//            case 3 :
//            case 4 :
//            case 5:System.out.println("Weekday");
//            break;
//            case 6 :
//            case 7 : System.out.println("Weekend");
//            break;
//        }

        //enhanced
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}