package startjava.lesson1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1. Подсчет суммы четных и нечетных чисел");
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int startNumber = -10;
        do {
            if (startNumber % 2 == 0) {
                sumOfEven += startNumber;
            } else {
                sumOfOdd += startNumber;
            }
            startNumber++;
        } while (startNumber <= 20);
        System.out.println("Сумма четных чисел равна " + sumOfEven + ", а сумма нечетных " + sumOfOdd);

        System.out.println("\nЗадание 2. Вывод чисел в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        for (int i1 = max - 1; i1 > min; i1--) {
            System.out.print(i1 + " ");
        }

        System.out.println("\n\nЗадание 3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int summ = 0;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            summ += digit;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("исходное число в обратном порядке " + reverse + ", сумма цифр = " + summ);

        System.out.println("\nЗадание 4. Вывод чисел в несколько строк");
        int count = 0;
        for (int i1 = 1; i1 < 24; i1++) {
            if (i1 % 2 != 0) {
                System.out.printf("%4d", i1);
                count++;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }

        while (count > 0 && count < 5) {
            System.out.printf("%4d", 0);
            count++;
        }

        System.out.println("\n\nЗадание 5. Проверка количества двоек числа на четность/нечетность");
        int number4 = 3242592;
        int count1 = 0;
        //считаем количество двоек
        while (number4 > 0) {
            if (number4 % 10 == 2) {
                count1++;
            }
            number4 /= 10;
        }
        //проверяем четное ли количество двоек
        if (count1 % 2 == 0) {
            System.out.println("\nКоличество двоек в 3242592 четное - " + count1);
        } else {
            System.out.println("\nКоличество двоек в 3242592 нечетное - " + count1);
        }

        System.out.println("\nЗадание 6. Отображение геометрических фигур");
        //квадрат
        for (int square = 0; square < 5; square++) {
            System.out.println("**********");
        }
        //треугольник 1
        System.out.println();
        int k = 5;
        while (k >= 1) {
            int j = k;
            while (j >= 1) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            k--;
        }
        System.out.println();

        // треугольник 2
        int rows = 5;
        int currentRow = 1;
        do {
            int symbols = currentRow;
            if (currentRow > rows / 2 + 1) {
                symbols = rows - currentRow + 1;
            }
            int printedSymbols = 0;
            do {
                System.out.print("$");
                printedSymbols++;
            } while (printedSymbols < symbols);
            System.out.println();
            currentRow++;
        } while (currentRow <= rows);

        System.out.println("\nЗадание 7. Отображение геометрических фигур");
        System.out.print("\n DECIMAL  | CHARACTER |     DESCRIPTION\n");
        System.out.print("--------------------------------------------\n");
        //получаем нечетные коды символов прибавляя 2 к первому нечетному коду 15
        // можно было бы еще через диапазон символов (int j = 'a'; j <= 'z'; j += 2)
        for (int j = 15; j < 48; j += 2) {
            displayCharInfo(j);
        }
        System.out.print("--------------------------------------------\n");
        //получаем нечетные коды перебором и проверкой всех кодов в множестве
        for (int j = 97; j < 123; j++) {
            if (j % 2 != 0) {
                displayCharInfo(j);
            }
        }

        System.out.println("\nЗадание 8. Проверка, является ли число палиндромом");
        int someNumber = 1234321;

        if (isItPalindrome(someNumber)) {
            System.out.println("Число " + someNumber + " является палиндромом.");
        } else {
            System.out.println("Число " + someNumber + " не является палиндромом.");
        }

        System.out.println("\nЗадание 9. Проверка, является ли число счастливым");
        int randomSixDigits = 100000 + (int) (Math.random() * 900000);
        System.out.println(randomSixDigits);
        int sumFirstThree = 0;
        int sumLastThree = 0;

        for (int i3 = 0; i3 < 6; i3++) {
            int digit = randomSixDigits % 10;
            randomSixDigits /= 10;
            if (i3 < 3) {
                sumLastThree += digit;
            } else {
                sumFirstThree += digit;
            }
        }
        if (sumLastThree == sumFirstThree) {
            System.out.println("Сумма первых трех цифр числа равна сумме последних трех цифр");
        } else {
            System.out.println("Суммы первых и последних трех цифр числа не равны");
        }

        System.out.println("\nЗадание 10. Отображение таблицы умножения Пифагора");
        System.out.println("ТАБЛИЦА ПИФАГОРА");
        System.out.print("  |\t");

        for (int g = 2; g <= 9; g++) {
            System.out.print(g + "\t");
        }

        System.out.print("\n----------------------------------\n");

        for (int g = 2; g <= 9; g++) {
            System.out.print(g); // Вывод чисел от 2 до 9 в первом столбце
            System.out.print(" |\t"); // Вертикальная линия

            for (int j = 2; j <= 9; j++) {
                System.out.print(g * j + "\t");
            }
            System.out.println();
        }
    }


    public static boolean isItPalindrome(int number) {
        String str = Integer.toString(number);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static void displayCharInfo(int code) {
        char ch = (char) code;
        String name = Character.getName(code);
        if (name == null) {
            name = "";
        }
        System.out.printf("   %-5d  |    %-4c   | %-25s\n", code, ch, name);
    }

}