package lesson2;

public class Calculator {
    public float calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> {
                if (number2 == 0) {
                    System.out.println("Ошибка: деление на ноль.");
                    yield Float.NaN;
                } else {
                    yield (float) number1 / number2;
                }
            }
            case '^' -> (float) Math.pow(number1, number2);
            case '%' -> number1 % number2;
            default -> {
                System.out.println("Ошибка: операция \"" + operation + "\" не поддерживается.");
                yield Float.NaN;
            }
        };
    }
}
