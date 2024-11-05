package Day07_static_final;

public class Main {
    public static void main(String[] args) {
        Task01Airplane su = new Task01Airplane("Su", 1992, 8, 3);
        Task01Airplane tu = new Task01Airplane("Tu", 1980, 30, 10);
        Task01Airplane.compareAirplanes(su, tu);

        Task02Player player1 = new Task02Player(90);
        Task02Player player2 = new Task02Player(93);
        Task02Player player3 = new Task02Player(94);
        Task02Player.info();
        Task02Player player4 = new Task02Player(99);
        Task02Player player5 = new Task02Player(100);
        Task02Player player6 = new Task02Player(91);
        Task02Player.info();

        System.out.println(player6.getCountPlayers());

        System.out.println(player6.getStamina());
        while (player6.getStamina() != 0) {
            player6.run();
        }
        System.out.println(player6.getStamina());
        Task02Player.info();
    }
}