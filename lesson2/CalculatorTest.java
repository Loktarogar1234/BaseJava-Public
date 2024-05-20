package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            int number1 = getIntInput(scanner);
            System.out.print("Введите знак математической операции: ");
            char operation = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int number2 = getIntInput(scanner);

            float result = calculator.calculate(number1, number2, operation);
            if (!Float.isNaN(result)) {
                if (operation == '/' || operation == '^') {
                    System.out.printf("Результат операции %c: %.5f\n", operation, result);
                } else {
                    System.out.printf("Результат операции %c: %.0f\n", operation, result);
                }
            }

            String userResponse;
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userResponse = scanner.next();
            } while (!userResponse.equalsIgnoreCase("yes") && !userResponse.equalsIgnoreCase("no"));

            if (userResponse.equalsIgnoreCase("no")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Программа завершена. Спасибо за использование!");
    }

    private static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.next(); // Очистка буфера сканера
            }
        }
    }
}
