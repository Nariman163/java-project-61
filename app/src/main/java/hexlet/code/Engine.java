package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void runGame(String[] questions, String[] correctAnswers, String gameRule) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);

        for (int i=0; i<ROUNDS; i++){
            System.out.println("Question: " + questions[i]);
            System.out.println("You answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswers[i]);
                System.out.println("Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " +  userName + " !");
    }
}
