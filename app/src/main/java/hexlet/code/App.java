package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;

import java.util.Scanner;

public final class App {
    private App() {
        //Предотвращает создание класса
    }
    /**
     * Точка входа в программу.
     * @param args аргументы командной строки
     */
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Even\n2 - Calc\n0 - Exit");
        int selectNumber = scanner.nextInt();
        switch (selectNumber) {
            case 1:
                Even.evenGame();
                break;
            case 2:
                Calculator.calculateGame();
                break;
        }
        }
}
