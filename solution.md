#Solution
```java
public final class Logger {

    private static Logger instance;
    private static final String LOGGERFILE = "logger.txt";
    private PrintStream printStream;

    private Logger() {
        connect();
    }
   
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
// resto igual
}

public class Gammer {

    private String name;
    private int countGames;

    public Gammer(String name) {
        this.name=name;
        this.countGames = 0;
        Logger.getInstance().writeToLog("new Gammer - " + name);
}
    public void incGamesCount() {
        this.countGames++;
        Logger.getInstance().writeToLog("jogador" + name + "jogou mais um jogo ");
    }
}

public class Game {

    private Gammer gammer;

    public Game() {
    }

    public void start(Gammer gammer) {
        this.gammer = gammer;
        Logger.getInstance().writeToLog("game start");

    }

    public void play(int valor) {
        Logger.getInstance().writeToLog("play " + valor);

    }
}
```


