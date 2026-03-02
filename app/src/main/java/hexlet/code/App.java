package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public final class App {
    private App() {
        //Предотвращает создание класса
    }
    /**
     * Точка входа в программу.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Even\n2 - Calc\n3 - GCD\n4 - Progression\n0 - Exit");
        int selectNumber = scanner.nextInt();
        switch (selectNumber) {
            case 1:
                Even.evenGame();
                break;
            case 2:
                Calculator.calculateGame();
                break;
            case 3:
                GCD.gcdGame();
                break;
            case 4:
                Progression.progressionGame();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Select correct number");
        }
    }
}
