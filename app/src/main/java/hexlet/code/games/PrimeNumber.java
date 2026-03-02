package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeNumber {
    public static void primeGame() {
        String[] question = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(100);
            question[i] = Integer.toString(number);
            correctAnswers[i] = isPrime(number) ? "yes" : "no";
        }

        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.runGame(question, correctAnswers, rule);
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
