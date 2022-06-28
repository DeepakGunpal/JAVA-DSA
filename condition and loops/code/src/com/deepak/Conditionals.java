package com.deepak;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    /*
    Syntax of if statements:
    if (boolean expression T or F){
        //body
    }else {
        //do this
     }
    * */

        int salary = 15400;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }

        //multiple if-else
         if (salary>20000){
             salary += 3000;
         } else if (salary > 10000) {
             salary += 2000;
         }else {
             salary += 1000;
         }
        System.out.println(salary);
    }
}