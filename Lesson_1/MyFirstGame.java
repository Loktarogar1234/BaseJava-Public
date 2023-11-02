public class MyFirstGame {
    public static void main(String[] args) {
        int numberStart = 1;
        int numberFinish = 100;
        int number = (int) (Math.random() * 100) + 1; //а как еще компьютер загадает число??
        int playerBet;
        System.out.println("Компьютер загадал число в диапазоне от 1 до 100. Делайте ваши ставки!");
        while (true) {
            //при каждом проходе игрок всегда выбирает середину интервала
            //подход подсмотрел у David Malan в Гарвардском курсе CS50
            playerBet = (numberStart + numberFinish) / 2;
            System.out.println("Ваша ставка: " + playerBet);
            if (playerBet == number) {
                System.out.println("Вы победили! Jackpot!");
                break;
            } else if (playerBet < number) {
                System.out.println("Ваша ставка " + playerBet + " меньше того, что загадал компьютер.");
                numberStart = playerBet + 1; //если ставка игрока больше числа, сдвигаем начало диапазона к ставке + 1
            } else {
                System.out.println("Ваша ставка " + playerBet + " больше того, что загадал компьютер.");
                numberFinish = playerBet - 1; //если ставка игрока меньше числа, сдвигаем конец диапазона к ставке - 1
            }
        }
    }
}
