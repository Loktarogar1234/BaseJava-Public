package startjava.lesson1;

import java.util.Scanner;

public class Calculator {
    @SuppressWarnings("checkstyle:VariableDeclarationUsageDistance")
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Калькулятор! Далее вам будет предложено ввести значения" +
                " переменных 'a' и 'b', затем знак проводимого с ними действия (пример a + b или a ^ b");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение переменной a (целое число)");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Введите значение переменной b (целое число)");
        int b = scan.nextInt();
        scan.nextLine();

        char sign;
        while (true) {
            System.out.println("Введите знак проводимого с переменными действия (выберите один + - * / ^ %)");
            String input = scan.nextLine();
            sign = input.charAt(0);

            if ("+-*/^%".indexOf(sign) >= 0) {
                break;
            } else {
                System.out.println("Вы ввели недопустимый символ. Попробуйте еще раз.");
            }
        }

        float result = 1;
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