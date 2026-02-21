package hexlet.code;

public final class App {
    private App() {
        //Предотвращает создание класса
    }
    /**
     * Точка входа в программу.
     * @param args аргументы командной строки
     */
    public static void main(final String[] args) {
        Cli.meetGames();
    }
}
