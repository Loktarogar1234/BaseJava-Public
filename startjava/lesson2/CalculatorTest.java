package startjava.lesson2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            char operation = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();

            float result = calculator.calculate(number1, number2, operation);
            if (!Float.isNaN(result)) {
                System.out.println("Результат: " + result);
            }

            String userResponse;
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userResponse = scanner.next();
            } while (!userResponse.equals("yes") && !userResponse.equals("no"));

            if (userResponse.equals("no")) {
                break;
            }


        }

        scanner.close();
    }
}
