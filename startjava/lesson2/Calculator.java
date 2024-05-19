package startjava.lesson2;

public class Calculator {

    public float calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number2 != 0 ? (float) number1 / number2 : Float.NaN;
            /* А можно было бы отловить исключение
            if (num2 == 0) {
                throw new IllegalDivision("Деление на ноль");
                }
             */
            case '^' -> (float) Math.pow(number1, number2);
            case '%' -> number1 % number2;
            default -> {
                System.out.println("Неподдерживаемая операция");
                yield Float.NaN;
                //throw new IllegalDivision("Операция " + operation + " не поддерживается");
            }
        };
    }
}


