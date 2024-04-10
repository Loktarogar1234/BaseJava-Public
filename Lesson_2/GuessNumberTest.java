package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.next());

        GuessNumber game = new GuessNumber(player1, player2);

        String response;
        do {
            game.startGame();

            while (true) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                response = scanner.next();
                if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("Неверный ввод. Пожалуйста, введите 'yes' или 'no'.");
            }
        } while (response.equalsIgnoreCase("yes"));
    }
}

