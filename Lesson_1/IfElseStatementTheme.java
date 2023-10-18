public class IfElseStatementTheme  {
    public static void main(String[] args) {
        
        System.out.println("\nЗадание 1. Вывод характеристик компьютера");
        int age = 21;
        double height = 1.8;
        boolean genderMan = true;

        if(!genderMan){
            System.out.println("You are WOMAN");
        } else {
            System.out.println("Yep, you are MAN");
        }
    
        if(age>18){
            System.out.println("You are adult");
        } else {
            System.out.println("You are child");
        }

        if(height>1.7){
            System.out.println("Watch you head! Low ceiling!");
        } else {
            System.out.println("You are welcome!");
        }

        char firstNameLetter = "Eugene".charAt(0);
        if(firstNameLetter == 'M'){
            System.out.println("First letter of your name is M");
        } else if(firstNameLetter == 'I') {
            System.out.println("First letter of your name is I");
        } else { System.out.println("First letter of your name is neither M nor I. You probably cheating!");
        }
        System.out.println("\nЗадание 2. Поиск большего числа");
        //заданию не противоречит, и запрета на рандом не было. диапазон значений от 0 до 99
        int variable1 = (int) (Math.random() * 100);
        int variable2 = (int) (Math.random() * 100);
        //для проверки на равенство. проверено, работает
        //int variable1 = 5, variable2 = 5;
        
        if(variable1 > variable2){
            System.out.println(variable1 + " больше, чем " + variable2);
        } else if(variable1 < variable2){
            System.out.println(variable2 + " больше, чем " + variable1);
        } else {
            System.out.println("оба числа равны (" + variable1 + " = " + variable2 + ")");
        }
        System.out.println("\nЗадание 3. Проверка числа");
        //диапазон значений от -100 до 100
        int variable3 = (int) (Math.random() * 201 - 100);
       
        if(variable3 == 0){
            System.out.println("Число " + variable3 + " равно нулю");
        } else if(variable3 > 0 && variable3 % 2 == 0){
            System.out.println("Число " + variable3 + " положительное и чётное");
        } else if(variable3 > 0 && variable3 % 2 != 0){
            System.out.println("Число " + variable3 + " положительное и нечётное");
        } else if(variable3 < 0 && variable3 % 2 == 0){
            System.out.println("Число " + variable3 + " отрицательное и чётное");
        } else {
            System.out.println("Число " + variable3 + " отрицательное и нечётное");
        }
        
        System.out.println("\nЗадание 4. Поиск одинаковых цифр в числах");
        //диапазон значений от 100 до 999
        int variable4 = (int) (Math.random() * 900 + 100);
        int variable5 = (int) (Math.random() * 900 + 100);
        //int variable4 = 123;      //проверил, работает
        //int variable5 = 223;
        System.out.println("Исходные числа = " + variable4 + " " + variable5);
        boolean coincidences = false;

        for (int i = 0; i < 3; i++) {
            int digit1 = variable4 % 10;
            int digit2 = variable5 % 10;
            if (digit1 == digit2) {
                coincidences = true;
                System.out.println("Одинаковая цифра = " + digit1 + " в разряде № " + (i + 1));
            }
            variable4 /= 10;
            variable5 /= 10;
            if (!coincidences) 
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
        int depo = 301000;
        System.out.println("ваш депозит " + depo + " руб.");
        if(depo < 100000){
            System.out.println("% начислено " + (depo / 100 * 5) + " руб. Итого капитализация "
                + (depo /100 * 105) + "руб.");
        } else if ((depo > 100000) | (depo < 300000)){
            System.out.println("% начислено " + (depo /100 * 7) + " руб. Итого капитализация "
                + (depo / 100 * 107) + "руб.");
        } else {
            System.out.println("% начислено " + (depo /100 * 10) + " руб. Итого капитализация "
                + (depo /100 * 110) + "руб.");
        }

        System.out.println("\nЗадание 7. Определение оценки по предметам");
        //два вечера ломал голову над реализацией именно такой логики
        double historyGrade = 59;
        double programmingGrade = 92;

        int historyScore = getGrade(historyGrade);
        int programmingScore = getGrade(programmingGrade);

        System.out.println("история " + historyScore);
        System.out.println("программирование " + programmingScore);

        double averageScore = (historyScore + programmingScore) / 2.0;
        System.out.println("средний балл оценок по предметам " + averageScore);

        double averagePercentage = (historyGrade + programmingGrade) / 2.0;
        System.out.println("Средний процент по предметам " + averagePercentage + "%");
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