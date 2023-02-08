package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner= new Scanner(System.in);
        int numb = scanner.nextInt();
        System.out.println("Треугольное число : " + sum(numb));
    }

    static int sum(int numb){
        return ((numb+1)*numb)/2;
    }
}



