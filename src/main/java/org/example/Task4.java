package org.example;

import java.util.Scanner;

//Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
public class Task4 {

    public static int enterNumb(){
        return new Scanner(System.in).nextInt();
    }
    public static String act(){
        return new Scanner(System.in).nextLine();
    }
    public static int getResult(String op,int n1,int n2){
        int result = 0;
        switch (op){
            case "+":
                result = n1+n2;
                break;
            case "-":
                result = n1-n2;
                break;
            case "*":
                result = n1*n2;
                break;
            case "/":
                result = n1/n2;
                break;
            default:
                System.out.println("Введите : +,-,*,/");
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Введите первое число :");
        int numb1 = enterNumb();
        System.out.println("Введите операцию вычисления : +,-,*,/");
        String operations = act();
        System.out.println("Введите второе число :");
        int numb2 = enterNumb();
        int res = getResult(operations,numb1,numb2);
        System.out.format("Результат вычисления %d %s %d = %d",numb1,operations,numb2,res);
    }
}
