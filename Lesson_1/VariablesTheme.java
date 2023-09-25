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
         //объявляем целочисленные переменные a b (некрасиво, запро просто)
         int a = 2, b = 5;
         
         //меняем местами значения переменных a b с помощью третьей переменной c
         int c = a;
         a = b;
         b = c;

         //меняем местами значения переменных a b помощью арифмектики
         a += b;
         b -= a - b;
         a -= b;

         //меняем местами значения переменных a b побитно
         a = a ^ b;
         b = b ^ a;
         a = a ^ b;

        
     

    }
}
