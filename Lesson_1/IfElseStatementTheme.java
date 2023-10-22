public class IfElseStatementTheme  {
    public static void main(String[] args) {

        System.out.println("\nЗадание 1. Вывод характеристик компьютера");
        int age = 21;
        double height = 1.8;
        boolean genderMan = true;

        if(!genderMan) {
            System.out.println("Вы женщина");
        } else {
            System.out.println("Вы мужчина");
        }
    
        if(age > 18) {
            System.out.println("Вы взрослый");
        } else {
            System.out.println("Ты ребенок");
        }

        if(height > 1.7) {
            System.out.println("Вы высокий");
        } else {
            System.out.println("Вы низкого роста");
        }

        char firstNameLetter = "Eugene".charAt(0);
        if(firstNameLetter == 'M') {
            System.out.println("Первая буква в вашем имени - M");
        } else if(firstNameLetter == 'I') {
            System.out.println("Первая буква в вашем имени - I");
        } else {
            System.out.println("M и I не являются первыми буквами в вашем имени Eugene");
        }

        System.out.println("\nЗадание 2. Поиск большего числа");
        //диапазон значений от 0 до 99
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        //для проверки на равенство. проверено, работает
        //int num1 = 5, num2 = 5;
        
        if(num1 > num2) {
            System.out.println(num1 + " больше, чем " + num2);
        } else if(num1 < num2) {
            System.out.println(num2 + " больше, чем " + num1);
        } else {
            System.out.println("оба числа равны (" + num1 + " = " + num2 + ")");
        }

        System.out.println("\nЗадание 3. Проверка числа");
        //диапазон значений от -100 до 100
        int num3 = (int) (Math.random() * 201 - 100);

        //первый вариант решения
        if(num3 == 0) {
            System.out.println("Число = " + num3);
        } else if(num3 > 0 && num3 % 2 == 0) {
            System.out.println("Число " + num3 + " положительное и чётное");
        } else if(num3 > 0 && num3 % 2 != 0) {
            System.out.println("Число " + num3 + " положительное и нечётное");
        } else if(num3 < 0 && num3 % 2 == 0) {
            System.out.println("Число " + num3 + " отрицательное и чётное");
        } else {
            System.out.println("Число " + num3 + " отрицательное и нечётное");
        }

        //второй вариант решения (новый)
        if (num3 % 2 == 0) {
            if (num3 > 0) {
                System.out.println("Число " + num3 + " положительное и чётное");
            } else if (num3 <0) {
                System.out.println("Число = " + num3);
            }
        } else {
            if (num3 > 0) {
                System.out.println("Число " + num3 + " положительное и нечётное");
            } else {
                System.out.println("Число " + num3 + " отрицательное и нечётное");
            }
        }

        System.out.println("\nЗадание 4. Поиск одинаковых цифр в числах");
        //диапазон значений от 100 до 999
        int num4 = (int) (Math.random() * 900 + 100);
        int num5 = (int) (Math.random() * 900 + 100);
        System.out.println("Исходные числа = " + num4 + " " + num5);
        boolean coincidences = false;
        int digit1_1 = num4 % 10;
        int digit1_2 = num5 % 10;
        if (digit1_1 == digit1_2) {
            coincidences = true;
            System.out.println("Одинаковая цифра = " + digit1_1 + " в разряде № 1");
        }

        int digit2_1 = (num4 / 10) % 10;
        int digit2_2 = (num5 / 10) % 10;
        if (digit2_1 == digit2_2) {
            coincidences = true;
            System.out.println("Одинаковая цифра = " + digit2_1 + " в разряде № 2");
        }

        int digit3_1 = num4 / 100;
        int digit3_2 = num5 / 100;
        if (digit3_1 == digit3_2) {
            coincidences = true;
            System.out.println("Одинаковая цифра = " + digit3_1 + " в разряде № 3");
        }

        if (!coincidences) {
            System.out.println("Равных цифр в разрядах нет");
        }

        System.out.println("\nЗадание 5. Определение символа по его коду");
        char someSymbol = '\u0057';
        //'\u005E'
        //'\u0031'

        if (someSymbol >= 'a' && someSymbol <= 'z') {
            System.out.println("Маленькая буква");
        } else if (someSymbol >= 'A' && someSymbol <= 'Z') {
            System.out.println("Большая буква");
        } else if (someSymbol >= '0' && someSymbol <= '9') {
            System.out.println("Цифра");
        } else {
            System.out.println("не буква и не цифра, а что-то иное...");
        }

        System.out.println("\nЗадание 6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000; //депо - устоявшийся разговорный термин, имхо оправданно был использован
        int depositsitInterest = 0;
        if(deposit < 100000) {
            depositsitInterest = deposit / 100 * 5;
        } else if (deposit > 100000 | deposit < 300000) {
            depositsitInterest = deposit /100 * 7;
        } else {
            depositsitInterest = deposit /100 * 10;
        }
        System.out.println("Ваш депозит " + deposit + " руб. Начислено % " + depositsitInterest + " руб. " +
        "Итого капитализация " + (deposit /100 * 105) + " руб.");

        System.out.println("\nЗадание 7. Определение оценки по предметам");
        //два вечера ломал голову над реализацией именно такой логики
        double historyGrade = 59;
        double programmingGrade = 92;

        int history = getGrade(historyGrade);
        int programming = getGrade(programmingGrade);

        System.out.println("история " + history);
        System.out.println("программирование " + programming);

        double averageScore = (history + programming) / 2.0;
        System.out.println("средний балл оценок по предметам " + averageScore);

        double averagePercentage = (historyGrade + programmingGrade) / 2.0;
        System.out.println("Средний процент по предметам " + averagePercentage + "%");

        System.out.println("\nЗадание 8. Расчет годовой прибыли");
        int monthlySales = 19000;
        int monthlyRent = 50000; // на убытке работает корректно
        int monthlyProductionCost = 9000;
        int ebitda = (monthlySales - monthlyRent - monthlyProductionCost) * 12;

        if (ebitda > 0) {
            System.out.println("EBITDA равна +" + ebitda + " рублей");
        } else {
            System.out.println("EBITDA равна " + ebitda + " рублей");
        }
    }

    public static int getGrade(double percent) {
        if (percent <= 60) {
            return 2;
        } else if (percent <= 73) {
            return 3;
        } else if (percent <= 91) {
            return 4;
        } else {
            return 5;
        }
    }
}