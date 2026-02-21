package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public final class Even {
    private Even() {
    }

    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswerCount = 0;
        while (correctAnswerCount < 3) {
            Random random = new Random();
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswerCount++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                        + "'." + "\n" + "Let's try again, " + name);
                return;
            }
        }
        System.out.println("Congratulations, " + name);
    }

}
