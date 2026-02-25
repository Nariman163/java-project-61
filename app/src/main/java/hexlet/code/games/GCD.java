package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static void gcdGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];
        Random random = new Random();

        for (int i =0; i < Engine.ROUNDS; i++) {
            int number1 = random.nextInt(50);
            int number2 = random.nextInt(50);
            questions[i] = number1 + " " + number2;
            int gcd = calculateGCD(number1, number2);
            correctAnswers[i] = Integer.toString(gcd);
        }
        String rule = "Find the greatest common divisor of given numbers.";
        Engine.runGame(questions, correctAnswers, rule);
    }
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
