package org.example;

import java.util.Scanner;
//Вычислить n! (произведение чисел от 1 до n)
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner= new Scanner(System.in);
        int numb = scanner.nextInt();
        System.out.println("Факториал числа : " + fact(numb));
    }

    static int fact(int numb){
        int res = 1;
        for (int i = 1; i <= numb; i++) {
            res =res*i;
        }
        return res;
    }
}
