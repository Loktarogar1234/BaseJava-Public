package Lesson_2;

public class Calculator {

    public float calculate(int number1, int number2, char operation) {
        switch (operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number2 != 0 ? (float) number1 / number2 : Float.NaN;
            case '^':
                return (float) Math.pow(number1, number2);
            case '%':
                return number1 % number2;
            default:
                System.out.println("Неподдерживаемая операция");
                return Float.NaN;
        }
    }
}
