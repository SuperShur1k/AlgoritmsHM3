package org.example.lesson3;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
//        Task1
        System.out.println("Task1");
        System.out.println(yesNo(8));
        System.out.println(yesNo(3));
        System.out.println(yesNo(0));
        System.out.println(yesNo(-2));

//        Task2
        System.out.println("Task2");
        System.out.println("179 ---> " + sum(179));
        System.out.println("985 ---> " + sum(985));

//        Task3
        System.out.println("Task3");
        printFibonacci(10);
    }//main

//    =================================================
//    Task1:
//    Дано натуральное число N. Выведите слово YES,
//    если число N является точной степенью двойки,
//    или слово NO в противном случае.
//    Операцией возведения в степень пользоваться нельзя!

    public static String yesNo(int a) {
        if (a == 1){
            return "Yes";
        }
        else if (a <= 0 || a % 2 != 0){
            return "No";
        }

        return yesNo(a / 2);
    }

//    =================================================
//    =================================================
//    Task2:
//    Дано натуральное число N.
//    Вычислите сумму его цифр.
//    При решении этой задачи нельзя использовать строки,
//    списки, массивы (ну и циклы, разумеется).

    public static  int sum(int a) {
        if (a < 10) {
            return a;
        }

        return a % 10 + sum(a / 10);
    }

//    =================================================
//    =================================================
//    Task3:
//    Напишите рекурсивный метод,
//    который выводит на экран числа Фибоначчи
//    до N-ого элемента.

    public static int fibonacci(int a) {
        System.out.println(a);
        if (a <= 1) {
            return a;
        }else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static void printFibonacci(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

//    =================================================

}
