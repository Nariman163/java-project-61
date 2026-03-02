package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void progressionGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] correctAnswers = new String[Engine.ROUNDS];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int length = random.nextInt(6) + 5;
            int start = random.nextInt(10) + 1;
            int step = random.nextInt(4) + 1;
            int index = random.nextInt(length);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (j > 0) {
                    sb.append(" ");
                }
                if (j == index) {
                    sb.append("..");
                } else {
                    sb.append(start + j * step);
                }
            }

            questions[i] = sb.toString();
            int correctNumber = start + index * step;
            correctAnswers[i] = Integer.toString(correctNumber);
        }

        String rule = "What number is missing in the progression?";
        Engine.runGame(questions, correctAnswers, rule);
    }
}
