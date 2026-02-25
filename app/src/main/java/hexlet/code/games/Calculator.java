package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;



public class Calculator {
    public static void calculateGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];
        char[] isOperations = {'+', '-', '*'};
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            char operation = isOperations[random.nextInt(isOperations.length)];
            questions[i] = number1 + " " + operation + " " + number2;

            int result;
            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                default:
                    result = 0;
            }
            correctAnswers[i] = Integer.toString(result);
        }
        String rule = "What is the result of the expression?";
        Engine.runGame(questions, correctAnswers, rule);
    }
}
