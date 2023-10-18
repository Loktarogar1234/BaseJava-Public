public class CyclesTheme {
    public static void main(String[] args) {

    System.out.println("\nЗадание 1. Подсчет суммы четных и нечетных чисел");
    int even = 0;
    int odd = 0;
    int i = -10;

    do{
        if(i%2 == 0){
            even = even + i;
        } else {
            odd = odd + i;
        }
        i++;
    }
    while (i <= 20);

    System.out.println("Сумма четных чисел равна " + even + ", f сумма нечетных " + odd);

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


    }
}
