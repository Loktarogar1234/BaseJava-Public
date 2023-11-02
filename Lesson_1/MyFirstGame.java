package Lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int randomNumber = (int) (Math.random() * 100) + 1;
        int playerNumber;
        int count = 1;
        System.out.println("Компьютер загадал число в диапазоне от 1 до 100.");
        System.out.println("Интересно, за сколько проходов число будет угадано?!");
        while (true) {
            //при каждом проходе игрок всегда выбирает середину диапазона
            //подход подсмотрел у David Malan в Гарвардском курсе CS50, называется бинарный поиск
            playerNumber = (start + end) / 2;
            System.out.println("Ваше число: " + playerNumber);
            count++;
            if (playerNumber == randomNumber) {
                break;
            } else if (playerNumber < randomNumber) {
                System.out.println("Ваша ставка " + playerNumber + " меньше того, что загадал компьютер.");
                start = playerNumber + 1;
                //если ставка игрока больше числа, сдвигаем начало диапазона к ставке + 1
            } else {
                System.out.println("Ваша ставка " + playerNumber + " больше того, что загадал компьютер.");
                end = playerNumber - 1;
                //если ставка игрока меньше числа, сдвигаем конец диапазона к ставке - 1
            }
        }
        System.out.println("Вы победили! Jackpot! Число угадано за " + count + " проходов." );
    }
}
