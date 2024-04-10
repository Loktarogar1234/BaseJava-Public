package Lesson_2;

import java.util.Scanner;

public class CalculatorTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            char operation = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            try {
                float result = calculator.calculate(num1, num2, operation);
                System.out.println("Результат: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            while (true) {
                String answer = scanner.next();
                if ("yes".equalsIgnoreCase(answer)) {
                    break;
                } else if ("no".equalsIgnoreCase(answer)) {
                    System.out.println("Программа завершена.");
                    return;
                } else {
                    System.out.print("Пожалуйста, введите 'yes' для продолжения или 'no' для выхода: ");
                }
            }
        }
    }
}
