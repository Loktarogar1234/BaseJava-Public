package Lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1;

        while (true) {
            if (takeTurn(player1, scanner, targetNumber)) break;
            if (takeTurn(player2, scanner, targetNumber)) break;
        }
    }

    private boolean takeTurn(Player player, Scanner scanner, int targetNumber) {
        int guess = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println(player.name + ", введите ваше число: ");
                guess = scanner.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("Пожалуйста, введите число в диапазоне от 1 до 100.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Это не похоже на число. Попробуйте снова.");
                scanner.next(); // Очистка буфера сканера, не забывать!
            }
        }

        if (guess == targetNumber) {
            System.out.println("Поздравляем, " + player.name + "! Вы угадали число!");
            return true;
        } else if (guess < targetNumber) {
            System.out.println("Число " + guess + " меньше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + guess + " больше того, что загадал компьютер.");
        }
        return false;
    }
}
