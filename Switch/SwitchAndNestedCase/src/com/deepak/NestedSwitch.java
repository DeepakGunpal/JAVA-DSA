package com.deepak;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

//        switch (empId){
//            case 1:
//                System.out.println("Deepak gunpal");
//                break;
//            case 2:
//                System.out.println("Sanjay gunpal");
//                break;
//            case 3:
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("NO department entered");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("Enter corrent emailId");
//
//        }

        //better way or enhanced switch statement
        switch (empId) {
            case 1 -> System.out.println("Deepak gunpal");
            case 2 -> System.out.println("Sanjay gunpal");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("NO department entered");
                }
            }
            default -> System.out.println("Enter correct emailId");
        }
    }
}
