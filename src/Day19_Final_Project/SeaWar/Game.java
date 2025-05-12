package Day19_Final_Project.SeaWar;

public class Game {
    public static void main(String[] args) {
        Board board = new Board(10);
        //board.print();
        Ship ship = new Ship(Ship.Deck.THREE);
        board.addShip(new Coordinate(5, 5), ship, Orientation.HOR);
        board.print();
        board.addShip(new Coordinate(8, 8), ship, Orientation.VER);
        board.print();
    }


}