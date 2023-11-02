package Lesson_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Калькулятор! Далее вам будет предложено ввести значения" +
                " переменных 'a' и 'b', затем знак проводимого с ними действия (пример a + b или a ^ b");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение переменной a (целое число)");
        int a = scan.nextInt();
        //если ввести нецелое число, вылетит с ошибкой
        scan.nextLine();
        //здесь и далее очистка буфера ввода, иначе после ввода b вылетает с ошибкой

        System.out.println("Введите значение переменной b (целое число)");
        int b = scan.nextInt();
        scan.nextLine();

        char sign;
        while (true) {
            System.out.println("Введите знак проводимого с переменными действия (выберите один + - * / ^ %)");
            String input = scan.nextLine();
            sign = input.charAt(0);

            if ("+-*/^%".indexOf(sign) >= 0) {
            //изначально написал (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%')
            //но нашел альтернативный более правильный и короткий вариант (#почитать потом еще про этот метод)
                break;
            } else {
                System.out.println("Вы ввели недопустимый символ. Попробуйте еще раз.");
            }
        }

        float result = 1;
        //при делении целых чисел результат может быть дробным
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b != 0) {
                result = (float) a / b;
            } else {
                System.out.println("На ноль делить нельзя!");
                return;
            }
        } else if (sign == '^') {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Что-то пошло не так?");
            return;
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}