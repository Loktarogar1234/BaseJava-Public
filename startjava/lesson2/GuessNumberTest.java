package startjava.lesson2;

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

            response = getUserResponse(scanner);
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Игра завершена. Спасибо за игру!");
    }

    private static String getUserResponse(Scanner scanner) {
        String response;
        while (true) {
            System.out.print("Хотите сыграть еще раз? [yes/no]: ");
            response = scanner.next();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("Неверный ввод. Пожалуйста, введите 'yes' или 'no'.");
        }
        return response;
    }
}
