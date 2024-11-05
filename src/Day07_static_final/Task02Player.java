package Day07_static_final;

public class Task02Player {
    private int stamina;
    private final static int MAX_STAMINA = 100; // когда делал забыл про static
    private final static int MIN_STAMINA = 0; // когда делал забыл про static
    private static int countPlayers; // когда делал сделал public


    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", (6 - countPlayers));
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public Task02Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }
}