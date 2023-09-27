public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задание 1. Вывод характеристик компьютера");

        //объявляем переменные Primitive Data Types и задаем им значения
        byte cpus = 1;
        short cores = 4;
        int memorySize = 16384;
        long coreSpeed = 3400000L;
        float coreVoltage = 0.972f;
        double technologyCpu = 0.000000007d;
        char hddLetter = 'C';
        boolean cdRreadable = false;

        //выводим в консоль значения переменных
        System.out.println("processors " + cpus + " - ко-во процессоров в компьютере");
        System.out.println("cores " + cores + " - ко-во ядер в процессоре");
        System.out.println("memorySize " + memorySize + " - размер оперативной памяти в Мб");
        System.out.println("coreSpeed " + coreSpeed + " - частота процессора в Gz");
        System.out.println("coreVoltage " + coreVoltage + " - напряжение на кристалле процессора");
        System.out.println("technologyCpu " + technologyCpu + " - техпроцесс производства чипов процессора");
        System.out.println("hddLetter " + hddLetter + " - имя первого hdd");
        System.out.println("cdRreadable " + cdRreadable + " - в компьютере установлен СД ридер");
        
        System.out.println("\nЗадание 2. Расчет стоимости товара со скидкой");
        
        //объявляем переменные и задаем им значения
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int fullPrice = penPrice + bookPrice;
        int discountSum = fullPrice / 100 * discount;
        int discountPrice = fullPrice - discountSum;
        System.out.println("Полная стоимость товаров - " + fullPrice + " рублей");
        System.out.println("Размер скидки - " + discountSum + " рублей");
        System.out.println("Стоимость товаров со скидкой - " + discountPrice + " рублей");

        System.out.println("\nЗадание 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадание 4. Вывод min и max значения целых числовых типов");
        //!!! мне кажется в постановке задания ошибка, где работа с min значениями?
        //объявляем переменные целых типов и задаем им максимальные значения
        byte numByte = 127;
        short numShort = 32767;
        int numInteger = 2147483647;
        long numbLong = 9223372036854775807L;
        System.out.println(numByte + " " + numByte++ + " " + numByte--);
        System.out.println(numShort + " " + numShort++ + " " + numShort--);
        System.out.println(numInteger + " " + numInteger++ + " " + numInteger--);
        System.out.println(numbLong + " " + numbLong++ + " " + numbLong--);

        System.out.println("\nЗадание 5. Перестановка значений переменных");
        System.out.println("\n1) с помощью третьей переменной");
        int a = 2;
        int b = 5;
        System.out.println(a + " " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
        
        System.out.println("\n2) с помощью помощью арифметики");
                System.out.println(a + " " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println(a + " " + b);
        
        System.out.println("\n3) побитно");
        System.out.println(a + " " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a + " " + b);

        System.out.println("\nЗадание 6. Вывод символов и их кодов");
        // объявляем переменные с кодами символов
        char oct1 = '$';
        char oct2 = '*';
        char oct3 = '@';
        char oct4 = '|';
        char oct5 = '~';
        //выводим символы и их коды через разделитель
        System.out.println(oct1 + " - " + (int) oct1);
        System.out.println(oct2 + " - " + (int) oct2);
        System.out.println(oct3 + " - " + (int) oct3);
        System.out.println(oct4 + " - " + (int) oct4);
        System.out.println(oct5 + " - " + (int) oct5);

        System.out.println("\nЗадание 7. Вывод в консоль ASCII-арт Дюка");
        // объявляем переменные для рисования
        char slash = '/';
        char underscore = '_';
        char parenthesisLeft = '(';
        char parenthesisRight = ')';
        char backslash = '\\';
        System.out.println("\n     "+ slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + parenthesisLeft + " " + parenthesisRight + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underscore+ underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\nЗадание 8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number/100;
        int tens = (number%100)/10;
        int ones = number%10;
        System.out.println("Число 123 содержит:");
        System.out.println(" сотен - " + hundreds);
        System.out.println(" десятков - " + tens);
        System.out.println(" единиц - " + ones);

        System.out.println("\nЗадание 9. Вывод времени");
        int someSeconds = 86399;
        int hours = someSeconds/3600; 
        int minutes = someSeconds/60%60;
        int seconds = someSeconds%60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
