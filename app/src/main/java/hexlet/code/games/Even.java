package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void evenGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answer = new String[Engine.ROUNDS];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(20);
            questions[i] = Integer.toString(number);
            answer[i] = (number % 2 == 0) ? "yes" : "no";
        }
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.runGame(questions, answer, rule);
    }

}
