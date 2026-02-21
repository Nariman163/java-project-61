package hexlet.code;
import java.util.Scanner;

public final class App {
    private App() {
        //Предотвращает создание класса
    }
    /**
     * Точка входа в программу.
     * @param args аргументы командной строки
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        Integer selectNumber = scanner.nextInt();
        if (selectNumber == 1) {
            Cli.meetGames();
        } else if (selectNumber == 2) {
            Even.evenGame();
        }
    }
}
