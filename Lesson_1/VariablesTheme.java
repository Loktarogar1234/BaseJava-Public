import java.lang.String;
public class VariablesTheme {
    public static void main(String[] args) {
        
        System.out.println("Задание 1. Вывод характеристик компьютера");
        
        //объявляем переменные Primitive Data Types и задаем им значения
        byte processors = 1;
        short cores = 4;
        int memorySize = 16384;
        long coreSpeed = 3400000L;
        float coreVoltage = 0.972f;
        double technologyCPU = 0.000000007d;
        char hdd = 'C';
        boolean cdRreadable = false;

        //выводим в консоль значения переменных
        System.out.println("processors " + processors + " - ко-во процессоров в компьютере");
        System.out.println("cores " + cores + " - ко-во ядер в процессоре");
        System.out.println("memorySize " + memorySize + " - размер оперативной памяти в Мб");
        System.out.println("coreSpeed " + coreSpeed + " - частота процессора в Gz");
        System.out.println("coreVoltage " + coreVoltage + " - напряжение на кристалле процессора");
        System.out.println("technologyCPU " + technologyCPU + " - техпроцесс производства чипов процессора");
        System.out.println("hdd " + hdd + " - имя первого hdd");
        System.out.println("cdRreadable " + cdRreadable + " - в компьютере установлен СД ридер");
        
        System.out.println("\nЗадание 2. Расчет стоимости товара со скидкой");
        
        //объявляем переменные и задаем им значения
        int penPrice = 100, bookPrice = 200, discount = 11;
        int fullPrice = (penPrice + bookPrice);
        int discountSize = fullPrice / 100 * discount;
        int discountPrice = fullPrice - discountSize;
        System.out.println("Полная стоимость товаров " + fullPrice + " рублей");
        System.out.println("Размер скидки " + discountSize + " рублей");
        System.out.println("Cтоимость товаров со скидкой " + discountPrice + " рублей");

        System.out.println("\nЗадание 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадание 4. Вывод min и max значения челых числовых типов");
        //!!! мне кажется в постановке задания ошибка, где работа с min значениями?
        //объявляем переменные целых типов и задаем им максимальные значения
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 = 9223372036854775807L;
        System.out.println(number1 + " " + number1-- + " " + number1++);
        System.out.println(number2 + " " + number2-- + " " + number2++);
        System.out.println(number3 + " " + number3-- + " " + number3++);
        System.out.println(number4 + " " + number4-- + " " + number4++);

        System.out.println("\nЗадание 5. Перестановка значений переменных");
        System.out.println("\n1) с помощью третьей переменной");
        int a1 = 2, b1 = 5;
        System.out.println(a1 + " " + b1);
        int c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println(a1 + " " + b1); // check
        
        System.out.println("\n2) с помощью помощью арифмектики");
        int a2 = 2, b2 = 5;
        System.out.println(a2 + " " + b2);
        a2 += b2;
        b2 = a2 - b2;
        a2 -= b2;
        System.out.println(a2 + " " + b2); // check
        
        System.out.println("\n3) побитно");
        int a3 = 2, b3 = 5;
        System.out.println(a3 + " " + b3);
        a3 = a3 ^ b3;
        b3 = b3 ^ a3;
        a3 = a3 ^ b3;
        System.out.println(a3 + " " + b3); // check

        System.out.println("\nЗадание 6. Вывод символов и их кодов");
        // объявляем переменные с кодами символов
        int oct1 = 36, oct2 = 42, oct3 = 64, oct4 = 124, oct5 = 126;
        //выводим символы и их коды через разделитель
        System.out.println(oct1 + " - " + (char) oct1);
        System.out.println(oct2 + " - " + (char) oct2);
        System.out.println(oct3 + " - " + (char) oct3);
        System.out.println(oct4 + " - " + (char) oct4);
        System.out.println(oct5 + " - " + (char) oct5);

        System.out.println("\nЗадание 7. Вывод в консоль ASCII-арт Дюка");
        // объявляем переменные для рисования
        char simb1 = '/', simb2 = '_', simb3 = '(', simb4 = ')', simb5 = '\\'; //!!! символ '\' не смогопределить в переменную  char, надо разобраться почему. update - сработало через '\\'
        System.out.println("\n    "+ simb1 + simb5);
        System.out.println("Знак ASCII будет ");
        System.out.println("Знак ASCII будет ");
        System.out.println("Знак ASCII будет ");
        System.out.println("Знак ASCII будет ");


        
        System.out.println("\u0068\u0065\u006c\u006c\u006f");

    }
}
