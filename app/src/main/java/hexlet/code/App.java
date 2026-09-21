package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
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
        System.out.println("1 - Even\n2 - Calc\n3 - GCD\n4 - Progression\n5 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        System.out.flush();
        int selectNumber = scanner.nextInt();
        scanner.nextLine();
        switch (selectNumber) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                System.out.flush();
                var greetName = scanner.nextLine();
                System.out.println("Hello, " + greetName + "!");
                break;
            case 2:
                Even.evenGame();
                break;
            case 3:
                Calculator.calculateGame();
                break;
            case 4:
                GCD.gcdGame();
                break;
            case 5:
                Progression.progressionGame();
                break;
            case 6:
                PrimeNumber.primeGame();
                break;
            case 0:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Select correct number");
        }
    }
}
